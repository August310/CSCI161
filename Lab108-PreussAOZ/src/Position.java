/**
 * Data Structure & Algorithms 6th Edition
 * Goodrick, Tamassia, Goldwasser
 * Code Fragments 7.7
 * 
 * An implementation of a simple Position interface
 * 
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 * 
 * @author August Preuss, transcribed by
 * @version 3/25/2025
 */
public interface Position<E> {
    /**
     * Returns the element stored at this position
     * 
     * @return the stored element
     * @throws IllegalStateException if position no longer valid
     */
    E getElement( ) throws IllegalStateException;
}
