
import java.util.Random;

/**
 *
 * @author August Preuss
 * @version 2/6/2025
 * A linked list class of generic type, implements generic bag interface
 * 
 */
public class LinkedBag<E> implements Bag<E> {
    
    
    private SinglyLinkedList<E> list;
    
    /**
     * Constructs a new generic SinglyLinkedList object
     */
    public LinkedBag(){
        list = new SinglyLinkedList<>();
    }
    
    /**
     * Calls the default constructor with a given size
     * @param capacity 
     */
    public LinkedBag(int capacity){
        this();     //calls default constructor
    }
    
    /**
     * gets size of list
     * @return int, represents size of list
     */
    @Override
    public int size() {
        return list.size();     //calls size() method so we aren't making a new size instance variable
    }
    
    /**
     * checks if list is empty
     * @return true is list is equal to 0, false if otherwise
     */
    @Override
    public boolean isEmpty() {
        return list.size() == 0;    //if size is zero return true, false if otherwise
    }
    
    /**
     * clears the list by creating a new instance of SinglyLinkedList
     */
    @Override
    public void clear() {
        list = new SinglyLinkedList<>();    //creates new singlylinkedlist object
    }
    
    /**
     * gets number of times a given item is found in the list
     * @param e
     * @return int count, number of times item is found in list
     */
    @Override
    public int getFrequencyOf(E e) {
        
        int count = 0;
        for(int i = 0; i < list.size(); i++){       
            E current = list.removeFirst();         //removes first item in list
            
            if(current.equals(e)){                  //checks if the value equals the one we want
                count++;
            }
            list.addLast(current);                  //adds back the value to end of list that we removed
        }
        
return count;

    }   
    
    /**
     * Checks if list contains a given item
     * @param e
     * @return true if item is found, false if otherwise
     */
    @Override
    public boolean contains(E e) {
        
        boolean found = false;
        
        for(int i = 0; i < list.size(); i++){
            E current = list.removeFirst();         //removes first item in list
            
            if(current.equals(e)){                  //checks if current item is equal to one we want, if yes found turns to true
                found = true;
            }
            
            list.addLast(current);                  //adds removed item back into the end of list
        }
        
        return found;
    }
    
    /**
     * adds new item to end of list
     * @param e 
     */
    @Override
    public void add(E e) {
        list.addLast(e);    //adds item to end of list
    }
    
    /**
     * removes an item as long as it is actually found in the list
     * @param e
     * @return null, if item selected isn't found, returns item if it is found in the list
     */
    @Override
    public E remove(E e) {
        
        
        E removedItem = null;
        
        int originalSize = list.size();         //used in the for loop so the list.size() variable is constant
        
        for(int i = 0; i < originalSize; i++){  //uses original size so size can't fluctuate as we go through list
            E current = list.removeFirst();     //removes first item in the item
            
            if(current.equals(e)){              //checks if item equals the value we want, if it does we assign it to removed item
                removedItem = current;          //we dont do list.addLast for this since we want to not add the removed item back into the list
                
            }
            else{                               //if item isn't found then we add the current value back into the list
                list.addLast(current);
            }
        }
        
        return removedItem;
    }
        
    /**
     * removes a random item from the list
     * @return item removed from the list
     * @throws IllegalStateException 
     */
    @Override
    public E remove() throws IllegalStateException {
        if(list.isEmpty()){
            throw new IllegalStateException("The remove() method cannot be called on an empty list.");
        }
        
        
        E removedItem = null;
        
        Random rand = new Random();
        
        int originalSize = list.size();
        
        int index = rand.nextInt(list.size());          //randomly assigns index a value within bounds of the list
        
        for(int i = 0; i < originalSize; i++){          //original size so list can't fluctuate during the loop
            
            E current = list.removeFirst();             //removes first item and assigns it to current
            
            if(i == index){                             //if given spot in for loop equals index, the item is removed at that spot
                removedItem = current;
                
            }
            else{                                       //if not at correct location, add to end of list so list is maintained
                list.addLast(current);
            }
            
        }
        
        return removedItem;
    }
   
    /**
     * gets item at a given index position
     * @param i
     * @return item found at the index position, throws exception if outside list size
     * @throws IndexOutOfBoundsException 
     */
    @Override
    public E get(int i) throws IndexOutOfBoundsException {
        if(i < 0 || i >= list.size()){
            throw new IndexOutOfBoundsException("You are out of the lists bounds.");
        }
        
       
        E returnedItem = null;
        
        
        for(int j = 0; j < list.size(); j++){           
            E current = list.removeFirst();         //removes first item in list and assigns it to current
            
            if(j == i){                             //if value i that we want matches with j in loop then we get that item
                returnedItem = current;
                
            }
            list.addLast(current);                  //we don't want to remove the item returned so we will always add the current item toend of list
        }
        
        return returnedItem;
    }
    
    /**
     * The classes respective toString method
     * @return a string of the size and items in the list
     */
    @Override
    public String toString(){
        String result = "size: " + list.size() + " items: ";        //start of our result string
        
        for(int i = 0; i < list.size(); i++){
            E current = list.removeFirst();                         //assigns first item to current
            
            result += current;                                      //current is added onto end of result string
            result += ", ";                                         //we then add a comma and space to continue the list
            
            list.addLast(current);                                  //add to end of list to maintain list structure
        }
        
        
        return result;
    }
    
    /**
     * The classes respective equals method
     * @param o
     * @return true if list and size are equal, false if otherwise
     */
    @Override
    public boolean equals(Object o){
        if(!(o instanceof LinkedBag))                       //checks if list is a LinkedBag instance
            return false;
        
        LinkedBag<E> l = (LinkedBag<E>) o;                  //type casts o to LinkedBag type
        
        boolean isEqual = true;     
        
        int originalSize = list.size();
        
        if(list.size() != l.size()){                        //makes sure size is equal, return false if not equal
            isEqual = false;
        }
        
        for(int i = 0; i < originalSize; i++){
            E current = list.removeFirst();                 //removes first item in list
            
            list.addLast(current);                          //adds item to end of list
            
            if(this.getFrequencyOf(current) != l.getFrequencyOf(current)){          //checks if each item appears at the same moment as the other
                isEqual = false;
            }
            
        }
        
        return isEqual;
    }
    
    
    
    
    
    
    
    
    
    
    
}
