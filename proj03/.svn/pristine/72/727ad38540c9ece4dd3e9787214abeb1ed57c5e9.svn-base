/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookStore;

import ProvidedClasses.BookStoreFactory;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

/**
 *
 * @author August Preuss
 */
public class BookStoreTest {
    //Makes factory method for BookStore class
    private BookStore createSampleBookStore(){
        return BookStoreFactory.getBookStoreInstance();
    }
    //Makes factory method for BookList class
    private BookList createSampleBookList(){
        return BookStoreFactory.getBookCollectionInstance();
    }
    //check if author is given if title is entered
    @Test
    public void testLookUpAuthorFound(){
        BookStore store = createSampleBookStore();
        
        String expected = "Charles Dickens";
        
        String actual = store.lookUpAuthor("Oliver Twist");
       
        assertEquals(expected, actual);
    }
    //accounts for if none of the books contain the given title
    @Test
    public void testLookUpAuthorNotFound(){
        BookStore store = createSampleBookStore();
        
        String expected = "Could Not Find Book";
        
        String actual = store.lookUpAuthor("Book doesn't exist");
        
        assertEquals(expected, actual);
    }
    //checks if price based on title entered is correct
    @Test
    public void testLookUpPriceFound(){
        BookStore store = createSampleBookStore();
       
        double expected = 27.99;
        
        double actual = store.lookUpPrice("Don Quixote");
        
        assertEquals(expected, actual, 0.01);
    }
    //Checks if a title that doesn't exist is entered
    @Test
    public void testLookUpPriceNotFound(){
        BookStore store = createSampleBookStore();
        
        double expected = Double.NaN;
        
        double actual = store.lookUpPrice("Nonexistent Book");
        
        assertEquals(expected, actual, 0.01);
    }
    //checks if book is returned after entering title
    @Test
    public void testSearchForTitleFound(){
        BookStore store = createSampleBookStore();
        
        BookList expected = new BookList();
        expected.add(new Book("Harry Potter and the Goblet of Fire", "J. K. Rowling", 27.99));
        
        BookList searchResult = store.searchForTitle("Harry Potter and the Goblet of Fire");
        
        assertEquals(expected, searchResult);
        assertEquals(1, searchResult.getSize());
        assertEquals("Harry Potter and the Goblet of Fire", searchResult.getBook(0).getTitle());        
        
    }
    //checks if nothing is returned properly
    @Test
    public void testSearchForTitleNotFound(){
        BookStore store = createSampleBookStore();
        
        BookList expected = new BookList();
        
        BookList searchResult = store.searchForTitle("Nonexistent Book");
        
        assertEquals(expected, searchResult);
        assertEquals(0, searchResult.getSize());
        
    }
    //checks if book is returned if author is provided
    @Test 
    public void testSearchForAuthorFound(){
        BookStore store = createSampleBookStore();
        
        BookList expected = new BookList();
        expected.add(new Book("The Count of Monte Cristo", "Alexandre Dumas", 22.95));
        
        BookList searchResult = store.searchForAuthor("Alexandre Dumas");
        
        assertEquals(expected, searchResult);
        assertEquals(1, searchResult.getSize());
        
    }
    //checks if book is found when author doesn't exist
    @Test 
    public void testSearchForAuthorNotFound(){
        BookStore store = createSampleBookStore();
        
        BookList expected = new BookList();
        
        BookList searchResult = store.searchForAuthor("Nonexistent Author");
        
        assertEquals(expected, searchResult);
        assertEquals(0, searchResult.getSize());
    }
    //checks for books less than the price entered
    @Test
    public void testSearchForPriceFound(){
        BookStore store = createSampleBookStore();
        
        BookList expected = new BookList();
        expected.add(new Book("A Study in Scarlet", "Arthur Conan Doyle", 8.95));
        
        BookList searchResult = store.searchForPrice("9.00");
        
        assertEquals(expected, searchResult);
        
        
    }
    //checks if null list 
    @Test
    public void testSearchForPriceNotFound(){
        
        BookStore store = new BookStore("Empty Store", new BookList());
        
        Book actual = store.getLowestPrice();
        
        assertNull(actual);
        
    }
    //checks for lowest price accuracy
    @Test
    public void testGetLowestPriceFound(){
        BookStore store = createSampleBookStore();
        
        Book expected = new Book("Treasure Island", "Robert Louis Stevenson", 7.95);
        
        Book actual = store.getLowestPrice();
        
        assertEquals(expected, actual);
        assertEquals(7.95, actual.getPrice(), 0.01);
        
    }
    //checks if list is null
    @Test 
    public void testGetLowestPriceNotFound(){
        
        
        BookStore store = new BookStore("Empty Store", new BookList());
        
        Book actual = store.getLowestPrice();
        
        assertNull(actual);
    }
    //checks if isbn is on list
    @Test
    public void testSearchByISBNFound(){
        BookStore store = createSampleBookStore();
        
        int searchISBN = 123456;
        
        Book expected = new Book("Flowers for Algernon", "Daniel Keyes", 13.95, true, searchISBN);
                
        BookList actual = store.searchByISBN(searchISBN);
        
        assertEquals(expected, actual.getBook(0));
        
        
    }
    //checks if isbn isn't on list
    @Test
    public void testSearchByISBNNotFound(){
        BookStore store = createSampleBookStore();
        
        int searchISBN = 000000;
        
        BookList result = store.searchByISBN(searchISBN);
        
        assertEquals(22, result.getSize());
    }
    
    //checks if books can properly be added to the list
    @Test
    public void testAddWorks(){
        BookList list = createSampleBookList();
        
        int initialSize = list.getSize();
        
        Book newBook = new Book("Diary of a Wimpy Kid", "Jeff Kinny", 10.99);
        
        list.add(newBook);
        
        assertEquals(initialSize + 1, list.getSize());
        assertEquals(newBook, list.getBook(initialSize));
        
        
    }
    //checks if book is null
    @Test
    public void testAddIsNull(){
        BookList list = createSampleBookList();
        int initialSize = list.getSize();
        
        Book nullBook = null;
        
        list.add(nullBook);
        
        assertEquals(initialSize, list.getSize());
        
        
    }
    
    //checks if removing a book properly rearranges the size of list
    @Test
    public void testRemoveWorks(){
        BookList list = createSampleBookList();
        
        int initialSize = list.getSize();
        
        Book removedBook = list.getBook(2);
        
        list.remove(removedBook);
        
        assertEquals(initialSize - 1, list.getSize());
        
        
        
    }
    //checks if book is null
    @Test
    public void testRemoveNull(){
        BookList list = createSampleBookList();
        
        int initialSize = list.getSize();
        
        Book nullBook = null;
        
        list.remove(nullBook);
        
        assertEquals(initialSize, list.getSize());
    }
    //gets the given book that is asked for 
    @Test
    public void testGetBook(){
        BookList list = createSampleBookList();
        
        Book expected = new Book("Don Quixote", "Miguel de Cervantes", 27.99);
        
        Book actual = list.getBook(0);
        
        assertEquals(expected, actual);
    }
    //checks if book is null 
    @Test
    public void testGetBookInvalidIndex(){
        BookList list = createSampleBookList();
        
        Book expected = null;
        
        Book actual = list.getBook(-1);
        
        assertEquals(expected, actual);
    }
    //checks if a list of book objects will be sorted alphabetically
    @Test 
    public void testSortListWorks(){
       
        BookList list = new BookList();
        list.add(new Book("Counting From 2 to 10", "August Preuss", 40.59));
        list.add(new Book("A Dangerous Jungle Adventure", "John Jungle", 14.99));
        list.add(new Book("Baseball and It's History", "Baseball Mike", 100.99));
        
        list.sortList();
        
        BookList expectedList = new BookList();
        expectedList.add(new Book("A Dangerous Jungle Adventure", "John Jungle", 14.99));
        expectedList.add(new Book("Baseball and It's History", "Baseball Mike", 100.99));
        expectedList.add(new Book("Counting From 2 to 10", "August Preuss", 40.59));
        
        assertEquals(expectedList, list);
    }
    //checks if size of list is less than zero
    @Test
    public void testSortListSizeLessThanZero(){
        BookList list = new BookList();
        list.sortList();
        assertEquals(0, list.getSize());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

