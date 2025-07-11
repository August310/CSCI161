

import java.util.Random;

/**
 *
 * @author August Preuss
 * @version 2/2/2025
 * A class of scores
 * 
 */
public class Scores {
    
    private int[] list;
    private int size;
    
    /**
     * Constructs a list of size 2
     */
    public Scores(){
        list = new int[2];
    }
    /**
     * Constructs a list of whatever size wanted
     * @param value 
     */
    public Scores(int value){
        list = new int[value];
    }
    /**
     * gathers size of list
     * @return size
     */
    public int size(){
        return size;
    }
    /**
     * Checks if list is empty
     * @return false if size doesn't equal 0, true if does
     */
    public boolean isEmpty(){
        return size == 0;
    }
    /**
     * clears the list to be just 0 values
     */
    public void clear(){
        for(int i = 0; i < list.length; i++){
            list[i] = 0;
        }
    }
    /**
     * finds the number of times that a number appears in the list
     * @param num
     * @return count, the number of times a given number is found
     */
    public int getFrequencyOf(int num){
        int count = 0;
        for(int i = 0; i < list.length; i++){
            
            if(list[i] == num){                
                count++;
            }
            
        }
        return count;
    }
    /**
     * checks if list contains a given number
     * @param num
     * @return true if number is in list, false if number is not in list
     */
    public boolean contains(int num){
        for(int i = 0; i < list.length; i++){
            if(list[i] == num){
                return true;
            }
        }
        return false;
    }
    /**
     * adds a number to list if not full, if full, creates a temp list that is double the size
     * @param num 
     */
    public void add(int num){
        if(size == list.length){
            int[] temp = new int[list.length * 2];
            for(int i = 0; i < list.length; i++){
                temp[i] = list[i];
            }
            list = temp;
            temp = null;
        }
        list[size] = num;
        size++;
    }
        
    /**
     * removes a number in the list that is selected by the user, shifts list over to the left from first instance of number appearing
     * @param num 
     */      
    public void remove(int num){
        int index = -1;
        for(int i = 0; i < size; i++){
            if(list[i] == num){
                index = i;
                break;
            }
        }
        if(index != -1){
        for(int i = index; i < list.length - 1; i++){
            
           list[i] = list[i + 1]; 
           
        }
        size--;
        
       }            
    }         
                
    /**
     * removes a random number from the list, shifts list to the left to fill in empty space from removed number
     * @return randomly removed number
     * @throws IllegalStateException 
     */         
    public int remove() throws IllegalStateException{
        
        
        if(isEmpty()){
            throw new IllegalStateException("The remove() method cannot be called on an empty list.");
        }
        Random rand = new Random();
        int index = rand.nextInt(size);
        int removedNum = list[index];
        for(int i = index; i < list.length - 1; i++){
        
        list[i] = list[i + 1];
        
      }
      size--;
      return removedNum;  
    }        
        
    /**
     * gets the number at the given index position
     * @param i, value entered by user to get index position of list
     * @return gets number in the list at index position i
     * @throws ArrayIndexOutOfBoundsException 
     */
    public int get(int i) throws ArrayIndexOutOfBoundsException{
       if(i < 0 || i >= size){
           throw new ArrayIndexOutOfBoundsException("You are past the arrays boundaries.");
       }
       
       return list[i];
       
    }
    
    
    /**
     * This classes respective toString method
     * @return size and the list of scores
     */
    public String toString(){
        String result = "size: " + size + " scores: ";
        for(int i = 0; i < list.length; i++){           
            result += list[i];
            result += ", ";            
        }
        return result;
    }
    
    /**
     * checks if two lists are equal in size and values
     * @param o, o is of Object superclass
     * @return true if list and size are equal, false if otherwise
     */
    public boolean equals(Object o){
        if(!(o instanceof Scores))
            return false;
        Scores s = (Scores) o;
        
        if(size != s.size)
           return false;
        
        for(int i = 0; i < size; i++){
        if(list[i] != s.list[i]){
            return false;
        }
    }
        return true;
    }
    


}