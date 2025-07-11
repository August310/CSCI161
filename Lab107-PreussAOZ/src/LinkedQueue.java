/**
 * Data Structure & Algorithms 6th Edition
 * Goodrick, Tamassia, Goldwasser
 * Code Fragments 6.11
 * 
 * Realization of a FIFO queue as an adaptation of a SinglyLinkedList
 * 
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 * 
 * @author August Preuss, transcribed by
 * @version 3/25/2025
 */
public class LinkedQueue<E> implements Queue<E> {
    private SinglyLinkedList<E> list = new SinglyLinkedList<>( );   // an empty list
    public LinkedQueue( ){ }            // new queue relies on the initially empty list
    public int size( ) { return list.size(); }
    public boolean isEmpty( ) { return list.isEmpty(); }
    public void enqueue(E element) { list.addLast(element); }
    public E first( ) { return list.first( ); }
    public E dequeue( ) { return list.removeFirst( ); }
}
