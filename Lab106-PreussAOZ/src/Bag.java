/**
 *
 * @author August Preuss
 * @version 2/4/2025
 * A generic interface class meant to be utilized by another class
 * 
 */
public interface Bag<E> {
    
    /**
     * Generic method meant to return size
     * @return int, which will be the size
     */
    public int size();
    
    /**
     * Checks if list is empty
     * @return true if empty, false if otherwise
     */    
    public boolean isEmpty();
    
    /**
     * Clears the list
     */
    public void clear();
    
    /**
     * Gets number of times a given element is found
     * @param e
     * @return int count, the number of times a given element is found
     */
    public int getFrequencyOf(E e);
    
    /**
     * Checks to see if a given value is found in a list
     * @param e
     * @return true if element is in list, false if otherwise
     */
    public boolean contains(E e);
    
    /**
     * adds an element to the list
     * @param e 
     */
    public void add (E e);
    
    /**
     * removes an item from the list
     * @param e
     * @return E, whatever data type E is
     */
    public E remove(E e);
    
    /**
     * removes a random element in list
     * @return E, whatever data type E is
     */
    public E remove();
    
    /**
     * gets the element at index position i
     * @param i, index position in list
     * @return E, whatever data type E is
     */
    public E get(int i);
    
    /**
     * The classes respective toString method
     * @return String for whatever user wants to display
     */
    public String toString();
    
    /**
     * The classes respective equals method
     * @param o
     * @return true if equal, false if otherwise
     */
    public boolean equals(Object o);
}
