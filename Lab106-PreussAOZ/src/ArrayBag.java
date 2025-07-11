

import java.util.Random;

/**
 *
 * @author August Preuss
 * @version 2/18/2025
 * A class for an array of generic type, implements generic bag interface
 * 
 */
public class ArrayBag<E> implements Bag<E> {
    
    private E[] list;
    private int size;
    
    /**
     * Constructs a list of size 2
     */
    public ArrayBag(){
        list = (E[]) new Object[2];
    }
    /**
     * Constructs a list of whatever size wanted
     * @param value 
     */
    public ArrayBag(int value){
        list = (E[]) new Object[value];
    }
    /**
     * gathers size of list
     * @return size
     */
    @Override
    public int size(){
        return size;
    }
    /**
     * Checks if list is empty
     * @return false if size doesn't equal 0, true if does
     */
    @Override
    public boolean isEmpty(){
        return size == 0;
    }
    /**
     * clears the list to be just null values
     */
    @Override
    public void clear(){
        for(int i = 0; i < list.length; i++){
            list[i] = null;
        }
    }
    /**
     * finds the number of times that a number appears in the list
     * @param e
     * @return count, the number of times a given number is found
     */
    @Override
    public int getFrequencyOf(E e){
        int count = 0;
        for(int i = 0; i < list.length; i++){   //loops over entire list
            
            if(list[i] == e){       //if given index equals e, we add one to the count                
                count++;
            }
            
        }
        return count;
    }
    /**
     * checks if list contains a given number
     * @param e
     * @return true if number is in list, false if number is not in list
     */
    @Override
    public boolean contains(E e){
        for(int i = 0; i < list.length; i++){   //goes through whole list
            if(list[i] == e){   //checks if index equals e, if it does return true
                return true;
            }
        }
        return false;
    }
    /**
     * adds a number to list if not full, if full, creates a temp list that is double the size
     * @param e 
     */
    @Override
    public void add(E e){
        if(size == list.length){
            E[] temp = (E[]) new Object[list.length * 2]; //creates a new list double the size of old one
            for(int i = 0; i < list.length; i++){
                temp[i] = list[i];      //temp gets all of the values from list
            }
            list = temp;                //list is assigned temp so now list is double the size
            temp = null;
        }
        list[size] = e;                 //if list is not full, we simply add e to the end of the list
        size++;
    }
        
    /**
     * removes a number in the list that is selected by the user, shifts list over to the left from first instance of number appearing
     * @param e 
     */
    @Override
    public E remove(E e){
        int index = -1;     //placeholder index since its possible there is no e match
        for(int i = 0; i < size; i++){
            if(list[i].equals(e)){      //if index spot equals e we give index the point where we found e in the list
                index = i;
                break;
            }
        }
        E removedElement = list[index]; //assigns variable to the spot it was found in list
        if(index != -1){
        for(int i = index; i < size - 1; i++){ //starts from index and goes to end of list
            
           list[i] = list[i + 1];       //shifts list left
           
        }
        list[size - 1] = null;          //assigns last value null to not repeat values
        size--;
        
       }
        
        return removedElement;
    }         
                
    /**
     * removes a random number from the list, shifts list to the left to fill in empty space from removed number
     * @return randomly removed number
     * @throws IllegalStateException 
     */         
    @Override
    public E remove() throws IllegalStateException{
        
        
        if(isEmpty()){
            throw new IllegalStateException("The remove() method cannot be called on an empty list.");
        }
        Random rand = new Random();
        int index = rand.nextInt(size); //random number has to be in list hence we use size
        E removedItem = list[index];
        for(int i = index; i < size - 1; i++){ //same method as remove(E e)
        
        list[i] = list[i + 1]; //shifts elements to the left from index position
        
        
      }
        list[size - 1] = null; //assigs right most value to null
      size--;
      return removedItem;  
    }        
        
    /**
     * gets the number at the given index position
     * @param i, value entered by user to get index position of list
     * @return gets number in the list at index position i
     * @throws ArrayIndexOutOfBoundsException 
     */
    @Override
    public E get(int i) throws ArrayIndexOutOfBoundsException{
       if(i < 0 || i >= size){
           throw new ArrayIndexOutOfBoundsException("You are past the arrays boundaries.");
       }
       
       return list[i]; //returns given index based off of user input
       
    }
    
    
    /**
     * This classes respective toString method
     * @return size and the list of scores
     */
    @Override
    public String toString(){
        String result = "size: " + size + " items: ";
        for(int i = 0; i < size; i++){     //iterates over whole list      
            result += list[i];          //appends each element to result String
            result += ", ";             //appends comma after to continue list      
        }
        return result;
    }
    
    /**
     * checks if two lists are equal in size and values
     * @param o, o is of Object superclass
     * @return true if list and size are equal, false if otherwise
     */
    @Override
    public boolean equals(Object o){
        if(!(o instanceof ArrayBag))
            return false;
        ArrayBag s = (ArrayBag) o;
        
        if(size != s.size)  //checks if sizes are equal
           return false;
        
        for(int i = 0; i < size; i++){ 
        if(list[i] != s.list[i]){   //checks if each list has the same elements in the same order
            return false;
        }
    }
        return true;
    }
    


}