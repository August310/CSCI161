package BookStore;

import BookStore.Book;
import java.util.ArrayList;
import java.util.Collections;

public class BookStore {


    String name;
    int Book[];
    public BookList library;

    public BookStore() {
        library = new BookList();
        library.add(new Book("Java Servlets", "Brown", 75.99, true, 123456));
        library.add(new Book("Advanced HTML", "Green", 56.99, false, 886324));
        library.add(new Book("Advanced Java", "Green", 65.99, false, 708911));
        library.add(new Book("Intro to Flash", "James", 34.49, true, 888922));
        library.add(new Book("Intro to HTML", "James", 29.49, false, 715540));
        library.add(new Book("Intro to Java", "James", 56.99, true, 803129));

    }

    public String getName() {
        return name;
    }

    public BookStore(BookList library) {
        this.library = library;
    }

    public BookStore(BookList[] libraries) {
        library = new BookList();
        for (BookList l : libraries) {
            for (int i = 0; i < l.getSize(); i++) {
                library.add(l.getBook(i));
            }
        }
    }

    public BookStore(String name, BookList library) {
        this.name = name;
        this.library = library;
    }


    @Override
    public String toString() {
        String result = "";
        for (Book tempBook : library) {
            result += tempBook.toString() + "\n";
        }
        return result;
    }

    @Deprecated
    public String loopupAuther(String searchString) {
        
        return lookUpAuthor(searchString);
    }

    //for each book check to see if the title equals the search, if so get the author
    public String lookUpAuthor(String searchString) {

        for (Book currentBook : library) {
            if (searchString.equals(currentBook.getTitle())) {
                return currentBook.getAuthor();
            }
        }
        return "Could Not Find Book";
    }

    //for each book check to see if the title equals the search, if so get the price
    public double lookUpPrice(String searchString) {

        for (Book currentBook : library) {
            if (searchString.equals(currentBook.getTitle())) {
                return currentBook.getPrice();
            }
        }
        return Double.NaN;

    }

    //for each book check to see if the title equals the search, if so add the book to a list
    public BookList searchForTitle(String searchString) {
        BookList searchResult = new BookList();

        for (Book currentBook : library) {
            if (searchString.equals(currentBook.getTitle())) {
                searchResult.add(currentBook);
            }
        }
        searchResult.saveSize();
        return searchResult;
    }

    @Deprecated
    public BookList searchForAuther(String searchString) {
        
        return searchForAuthor(searchString);
    }

    //for each book check to see if the author equals the search, if so add the book to a list
    public BookList searchForAuthor(String searchString) {
        BookList searchResult = new BookList();

        for (Book currentBook : library) {
            if (searchString.equals(currentBook.getAuthor())) {
                searchResult.add(currentBook);
            }
        }
        searchResult.saveSize();
        return searchResult;
    }

    //turn search into a double, then for each book check to see if price is less than the min entered in
    //if so, add the book to the list
    public BookList searchForPrice(String searchString) {
        BookList searchResult = new BookList();
        double min = Double.parseDouble(searchString);
        for (Book currentBook : library) {
            if (currentBook.getPrice() < min) {
                searchResult.add(currentBook);
            }
        }
        searchResult.saveSize();
        return searchResult;

    }

    //get price of each book and replace the min value if it's less than the prior minimum value
    public Book getLowestPrice() {
        if (library.getSize() == 0) {
            return null;
        }

        Book minBook = library.list[0];
        for (int i = 0; i < library.getSize(); i++) {
            if (library.list[i].getPrice() < minBook.getPrice()) {
                minBook = library.list[i];

            }

        }
        return minBook;
    }
    //for each book, determines if it's a hardcover book or not
    public boolean IsHardCover(String searchString) {
        for (Book currentBook : library) {
            if (searchString.equals(currentBook.getTitle())) {
                return currentBook.getHardCover();
            }

        }
        return false;
    }
    //for each book, gets the ISBN number
    public int getISBNNumber(String searchString) {
        for (Book currentBook : library) {
            if (searchString.equals(currentBook.getTitle())) {
                return currentBook.getISBN();
            }
        }
        return -1;
    }
    //enter an ISBN number, then goes through the list to find a match
    public BookList searchByISBN(int searchISBN) {
        BookList searchResult = new BookList();
        
        for (Book currentBook : library) {
            if (currentBook.getISBN() == searchISBN) {
                searchResult.add(currentBook);
            }
        }
        return searchResult;
    }

}
