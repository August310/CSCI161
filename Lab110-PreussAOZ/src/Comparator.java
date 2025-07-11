/**
 *
 * @author August Preuss
 * @version 4/30/2025
 * A generic interface to compare two objects with eachother
 * 
 */

public interface Comparator<E> {
    int compare(E o1, E o2);
}
