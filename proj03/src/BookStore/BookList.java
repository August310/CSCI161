package BookStore;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class BookList implements Iterable<Book> {

    public Book[] list;
    public int size;

    public BookList() {
        list = new Book[10];
        size = 0;
    }

    public BookList(Book[] booklist) {
        size = list.length;
        list = booklist;

    }

    public int getSize() {
        return size;
    }

    //Checks if book is null, otherwise adds book to list
    public void add(Book book) {
        if(book == null){
            return;
        }
        
        if (size == list.length) {
            ensureCapcity();

        }

        list[size] = book;
        size++;

        trimToSize();
    }

    //checks if book is null, otherwise removes the book from list
    public void remove(Book book) {
        if(book == null){
            return;
        }
        
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (list[i] == book) {
                index = i;
                break;
            }
        }
        //resizes the list
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                list[i] = list[i + 1];
            }

            list[size - 1] = null;
            size--;
        }

    }

   //Finds book based off of index value
    public Book getBook(int index) {
        if (index >= 0 && index < size) {
            return list[index];
        } else {
            return null;
        }
    }

    //Cuts down to exact length of book list
    private void trimToSize() {
        Book temp[] = new Book[size];
        for (int i = 0; i < size; i++) {
            temp[i] = list[i];
        }
        list = temp;

    }

    @Deprecated
    private void ensureCapcity() {
        //    if (size == list.length) {
        //        Book temp[] = new Book[list.length + 1];
        //        for (int i = 0; i < temp.length; i++) {
        //            temp[i] = list[i];
        //        }
        //        list = temp;
        //        temp = null;
        ensureCapacity();
    }

    //Makes sure there is adequate space for the amount of books in the list
    private void ensureCapacity() {
        if (size == list.length) {
            Book temp[] = new Book[list.length + 1];
            for (int i = 0; i < list.length; i++) {
                temp[i] = list[i];
            }
            list = temp;
            temp = null;
        }
    }

    
    public void displayList() {
        for (int i = 0; i < size; i++) {
            System.out.println(list[i]);
        }
    }

   //Sorts the list in alphabetical order
    public void sortList() {
        if(size < 0){
            return;
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (list[j].getTitle().compareTo(list[j + 1].getTitle()) > 0) {
                    Book temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    public void saveSize() {
        trimToSize();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BookList)) {
            return false;
        }

        BookList otherList = (BookList) o;
        if (this.getSize() != otherList.getSize()) {
            return false;
        }

        for (int i = 0; i < this.getSize(); i++) {
            if (!this.getBook(i).equals(otherList.getBook(i))) {
                return false;
            }

        }
        return true;
    }

    /**
     * Private inner class to allow the use of enhanced for loop with the
     * BookList class
     *
     * You should copy this code into your BookList class. Make sure that it is
     * not inside of other methods or it will not work correctly.
     *
     * You will also need to make sure that your BookList class implements the
     * Iterable interface and uses the Book type for the type parameter
     * (implements Iterable<Book>)
     *
     * When overriding the iterator() method that you need to implement, you can
     * return an instance of the BookIterator class by calling its constructor
     * method.
     */
    private class BookIterator implements Iterator<Book> {

        private int cursor;  // Index position for the current Book

        /**
         * Creates a new Iterator for this BookList
         */
        public BookIterator() {
            this.cursor = 0; // Set the cursor to the front of the array
        }

        @Override
        public boolean hasNext() {
            return this.cursor < size; // Determine if the next index position is valid
        }

        @Override
        public Book next() {
            if (this.hasNext()) {
                int current = cursor; // Save the current cursor position
                cursor++;             // Move the cursor over by one
                return list[current]; // Return the Book at the old cursor position
            }
            throw new NoSuchElementException(); // Attempted to get a non-exist Book
        }

    }

    @Override
    public Iterator<Book> iterator() {
        return new BookIterator();
    }

}
