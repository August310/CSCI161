
import java.util.ArrayList;
import java.util.List;

/**
 * Data Structure & Algorithms 6th Edition
 * Goodrick, Tamassia, Goldwasser
 * Code Fragments 8.7, 8.22
 * 
 * An abstract base class providing some functionality of the BinaryTree interface.  
 * 
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 * 
 * @author August Preuss, transcribed by
 * @version 3/25/2025
 */
public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> {
    
    /** Returns the Position of p's sibling (or null if no sibling exists). */
    public Position<E> sibling(Position<E> p) {
        Position<E> parent = parent(p);
        if (parent == null) return null;            // p must be the root
        if (p == left(parent))                      // p is a left child
            return right(parent);                   // (right child might be null)
        else                                        // p is a right child
            return left(parent);                    // (left child might be null)
    }
    /** Returns the number of children of Position p. */
    public int numChildren(Position<E> p) {
        int count = 0;
        if (left(p) != null)
            count++;
        if (right(p) != null)
            count++;
        return count;
    }
    /** Returns an iterable collection of the Positions representing p's children. */
    public Iterable<Position<E>> children(Position<E> p) {
        List<Position<E>> snapshot = new ArrayList<>(2);
        if (left(p) != null)
            snapshot.add(left(p));
        if (right(p) != null)
            snapshot.add(right(p));
        return snapshot;
    }
    
    /** Adds positions of the subtree rooted at Position p to the given snapshot. */
    private void inorderSubtree(Position<E> p, List<Position<E>> snapshot) {
        if (left(p) != null)
            inorderSubtree(left(p), snapshot);
        snapshot.add(p);
        if (right(p) != null)
            inorderSubtree(right(p), snapshot);
    }
    /** Returns an iterable collection of positions of the tree, reported in inorder. */
    public Iterable<Position<E>> inorder( ) {
        List<Position<E>> snapshot = new ArrayList<>( );
        if (!isEmpty( ))
            inorderSubtree(root( ), snapshot);
        return snapshot;
    }
    /** Overrides positions to make inorder the default order for binary trees. */
    public Iterable<Position<E>> positions( ) {
        return inorder( );
    }
    
    public void eulerTourBinary(BinaryTree<E> T, Position<E> p) {
        if (T.isInternal(p))
            System.out.print("(");
        if (T.left(p) != null)
            eulerTourBinary(T, T.left(p));
        
        System.out.print(p.getElement());
        
        if (T.right(p) != null)
            eulerTourBinary(T, T.right(p));
        
        if (T.isInternal(p))
            System.out.print(")");
    }
    
}
