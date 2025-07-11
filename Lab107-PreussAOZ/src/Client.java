
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author August Preuss
 * @version 3/28/2025
 * A client to test multiple data structures
 */
public class Client {

    public static void main(String[] args) {
        
        Random rand = new Random();
        
        ArrayStack arrayStack = new ArrayStack();
        
        System.out.println("Array Stack");
        System.out.println("Pushing 10 random numbers into array stack");
        
        for(int i = 0; i < 10; i++){
            int value = rand.nextInt(100);
            arrayStack.push(value);
            System.out.print(arrayStack.top() + ", ");
        }
        
        System.out.println();
        System.out.println("Popping the prior numbers in the array stack");
        
        while(!arrayStack.isEmpty()){
            System.out.print(arrayStack.pop() + ", ");
        }
        
        LinkedStack linkedStack = new LinkedStack();
        
        System.out.println();
        System.out.println();
        System.out.println("Linked Stack");
        System.out.println("Pushing 10 random numbers into linked stack");
        
        for(int i = 0; i < 10; i++){
            int value = rand.nextInt(100);
            linkedStack.push(value);
            System.out.print(linkedStack.top() + ", ");
        }
     
        System.out.println();
        System.out.println("Popping the prior numbers in the linked stack");
        
        while(!linkedStack.isEmpty()){
            System.out.print(linkedStack.pop() + ", ");
        }
        
        ArrayQueue arrayQueue = new ArrayQueue();
        
        System.out.println();
        System.out.println();
        System.out.println("Array Queue");
        System.out.println("Enqueueing 10 random numbers into array queue");
        
        for(int i = 0; i < 10; i++){
            int value = rand.nextInt(100);
            arrayQueue.enqueue(value);
            System.out.print(value + ", ");
        }
        
        System.out.println();
        System.out.println("dequeueing the prior numbers in the array queue");
        
        while(!arrayQueue.isEmpty()){
            System.out.print(arrayQueue.dequeue() + ", ");
        }
        
        LinkedQueue linkedQueue = new LinkedQueue();
        
        System.out.println();
        System.out.println();
        System.out.println("Linked Queue");
        System.out.println("Enqueueing 10 random numbers into linked queue");
        
        for(int i = 0; i < 10; i++){
            int value = rand.nextInt(100);
            linkedQueue.enqueue(i);
            System.out.print(value + ", ");
        }
        
        System.out.println();
        System.out.println("dequeueing the prior numbers in the linked queue");
        
        while(!linkedQueue.isEmpty()){
            System.out.print(linkedQueue.dequeue() + ", ");
        }
        
        LinkedPositionalList list = new LinkedPositionalList();
        
        System.out.println();
        System.out.println();
        System.out.println("Linked Positional List");
        System.out.println("Adding 10 random numbers to list");
        
        for(int i = 0; i < 10; i++){
            int value = rand.nextInt(100);
            list.addLast(value);
            System.out.print(value + ", ");
        }
        
        Iterator iterator = list.iterator();
        
        System.out.println();
        System.out.println("while iterator has another item in list, write it out");
        
        //Goes down list and prints out each elemet
        while(iterator.hasNext()){
            System.out.print(iterator.next() + ", ");
        }
        
        Position current = list.last();
        
        System.out.println();
        System.out.println("start at end of list, get element all the way to start of list");
        
        while (current != null) {
            System.out.print(current.getElement() + ", ");
            current = list.before(current);
        }
        
        System.out.println();
        System.out.println();
        System.out.println("Linked Binary Tree");
        
        //each tree object is labeled after the number it represents
        LinkedBinaryTree<String> tree1 = new LinkedBinaryTree();
        LinkedBinaryTree<String> tree2 = new LinkedBinaryTree();
        LinkedBinaryTree<String> tree2a = new LinkedBinaryTree();
        LinkedBinaryTree<String> tree2b = new LinkedBinaryTree();
        LinkedBinaryTree<String> tree2c = new LinkedBinaryTree();
        LinkedBinaryTree<String> tree2d = new LinkedBinaryTree();
        LinkedBinaryTree<String> tree5 = new LinkedBinaryTree();
        LinkedBinaryTree<String> tree7 = new LinkedBinaryTree();
        LinkedBinaryTree<String> tree8 = new LinkedBinaryTree();
        LinkedBinaryTree<String> tree9 = new LinkedBinaryTree();
        
        //each tree gets a node at root
        tree1.addRoot("1");
        
        tree2.addRoot("2");
        
        tree2a.addRoot("2");
        
        tree2b.addRoot("2");
        
        tree2c.addRoot("2");
        
        tree2d.addRoot("2");
        
        tree5.addRoot("5");
        
        tree7.addRoot("7");
        
        tree8.addRoot("8");
        
        tree9.addRoot("9");
        
        //each tree object represents a given mathematical sign
        LinkedBinaryTree<String> minus1 = new LinkedBinaryTree();
        LinkedBinaryTree<String> minus2 = new LinkedBinaryTree();
        LinkedBinaryTree<String> minus3 = new LinkedBinaryTree();
        LinkedBinaryTree<String> plus1 = new LinkedBinaryTree();
        LinkedBinaryTree<String> plus2 = new LinkedBinaryTree();
        LinkedBinaryTree<String> plus3 = new LinkedBinaryTree();
        LinkedBinaryTree<String> multiply1 = new LinkedBinaryTree();
        LinkedBinaryTree<String> multiply2 = new LinkedBinaryTree();
        LinkedBinaryTree<String> divide1 = new LinkedBinaryTree();
        
        //we go about attaching all of the trees from the bottom up to create our finalized tree
        plus1.addRoot("+");
        plus1.attach(plus1.root(), tree5, tree2);
        
        minus1.addRoot("-");
        minus1.attach(minus1.root(), tree2a, tree1);
        
        multiply1.addRoot("*");
        multiply1.attach(multiply1.root(), plus1, minus1);
        
        plus2.addRoot("+");
        plus2.attach(plus2.root(), tree2b, tree9);
        
        minus2.addRoot("-");
        minus2.attach(minus2.root(), tree7, tree2c);
        
        minus3.addRoot("-");
        minus3.attach(minus3.root(), minus2, tree2d);
        
        plus3.addRoot("+");
        plus3.attach(plus3.root(), plus2, minus3);
        
        divide1.addRoot("/");
        divide1.attach(divide1.root(), multiply1, plus3);
        
        multiply2.addRoot("*");
        multiply2.attach(multiply2.root(), divide1, tree8);
        
        
        System.out.println("Expression built: ((( 5 + 2 ) * ( 2 - 1 )) / (( 2 + 9 ) + (( 7 - 2 ) - 2 )) * 8)");
        
        System.out.println("Tree Height: " + multiply2.height(multiply2.root()));
        
        System.out.println();
        
        System.out.print("Preorder Traversal: ");
        for(Position p : multiply2.preorder()){
            System.out.print(p.getElement() + " ");
        }
        
        
        
        System.out.println();
        
        System.out.print("Inorder Traversal: ");
        for (Position p : multiply2.inorder()){
            System.out.print(p.getElement() + " ");
        }
        
        
        System.out.println();
        
        System.out.print("Postorder Traversal: ");
        for (Position p : multiply2.postorder()){
            System.out.print(p.getElement() + " ");
        }
        
        System.out.println();
        
        System.out.print("Breathfirst Traversal: ");
        for (Position p : multiply2.breadthfirst()){
            System.out.print(p.getElement() + " ");
        }
        
        System.out.println();
        
        System.out.print("Euler Tour Expression: ");
        multiply2.eulerTourBinary(multiply2, multiply2.root());
        System.out.println();
    }
    
}
