/**
 * Data Structure & Algorithms 6th Edition
 * Goodrick, Tamassia, Goldwasser
 * Code Fragments 6.9
 * 
 * An implementation of a simple Queue interface
 * 
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 * 
 * @author August Preuss, transcribed by
 * @version 3/25/2025
 */
public interface Queue<E> {
    /** Returns the number of elements in the queue. */
    int size();
    /** Tests whether the queue is empty. */
    boolean isEmpty();
    /** Inserts an element at the rear of the queue. */
    void enqueue(E e);
    /** Returns, but does not remove, the first element of the queue (null if empty) */
    E first();
    /** Removes and returns the first element of the queue (null if empty). */
    E dequeue();
}
