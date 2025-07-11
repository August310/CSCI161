package ProvidedClasses;

import BookStore.Book;
import BookStore.BookList;
import BookStore.BookStore;


public class BookStoreFactory 
{
    private BookStoreFactory()
    {
        
    }
    
    public static BookStore getBookStoreInstance()
    {
        BookStore store = new BookStore("The Shop Around The Corner", getBookCollectionInstance());
        
        return store; 
    }
    
    public static BookList getBookCollectionInstance()
    {
        BookList list = new BookList();
        
        list.add(new Book("Don Quixote", "Miguel de Cervantes", 27.99));
        list.add(new Book("Catch-22", "Joseph Heller", 19.95));
        list.add(new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 17.85)); 
        list.add(new Book("Anna Karenina", "Leo Tolstoy", 27.99));
        list.add(new Book("The Catcher in the Rye", "J. D. Salinger", 14.99));
        list.add(new Book("Pride and Prejudice", "Jane Austen", 19.95));
        list.add(new Book("A Tale of Two Cities", "Charles Dickens", 9.95));
        list.add(new Book("I, Robot", "Issac Asimov", 9.95));
        list.add(new Book("The Stand", "Stephen King", 14.49));
        list.add(new Book("Oliver Twist", "Charles Dickens", 13.99));
        list.add(new Book("A Study in Scarlet", "Arthur Conan Doyle", 8.95));
        list.add(new Book("The Count of Monte Cristo", "Alexandre Dumas", 22.95));
        list.add(new Book("The Moon is a Harsh Mistress", "Robert Heinlein", 9.95)); 
        list.add(new Book("The Hobbit", "J. R. R. Tolkein", 14.99));
        list.add(new Book("A Pocket Full of Rye", "Agatha Christie", 14.99));
        list.add(new Book("Ringworld", "Larry Niven", 19.95));
        list.add(new Book("Harry Potter and the Goblet of Fire", "J. K. Rowling", 27.99));
        list.add(new Book("A Wrinkle in Time", "Madeleine L'Engle", 14.95)); 
        list.add(new Book("War and Peace", "Leo Tolstoy", 27.99));
        list.add(new Book("The Adventures of Tom Sawyer", "Mark Twain", 8.95));
        list.add(new Book("Dragonflight", "Anne McCaffrey", 17.95)); 
        list.add(new Book("Treasure Island", "Robert Louis Stevenson", 7.95)); 
        list.add(new Book("Flowers for Algernon", "Daniel Keyes", 13.95, true, 123456)); 
        
        return list;    
    }
    
}
