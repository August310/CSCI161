/**
 * Data Structure & Algorithms 6th Edition
 * Goodrick, Tamassia, Goldwasser
 * Code Fragments 6.1
 * 
 * An implementation of a simple Stack interface
 * 
 * A collection of objects that are inserted and removed according to the last-in
 * first-out principle. Although similar in purpose, this interface differs
 * from the java.util.Stack
 * 
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 * 
 * @author August Preuss, transcribed by
 * @version 3/25/2025
 */
public interface Stack<E> {
    /**
     * Returns the number of elements in the stack.
     * @return number of elements in the stack
     */
    int size();
    
    /**
     * Tests whether the stack is empty.
     * @return true if the stack is empty, false otherwise
     */
    boolean isEmpty();
    
    /**
     * Inserts an element at the top of the stack.
     * @param e  the element to be inserted
     */
    void push(E e);
    
    /**
     * Returns, but does not remove, the element at the top of the stack.
     * @return top element in the stack (or null if empty)
     */
    E top();
    
    /**
     * Removes and returns the top element from the stack.
     * @return element removed (or null if empty)
     */
    E pop();
}
