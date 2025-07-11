package BookSearchEngine;

import BookStore.Book;
import BookStore.Book;
import BookStore.BookList;
import BookStore.BookStore;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class BookSearchEngine {

    static BookStore bookStore = new BookStore();

    public static void main(String[] args) {

        int option = 0;
        System.out.println("Welcome to the " + bookStore.getName() + " Bookstore.");

        while (option != 8) {

            System.out.println("Please make a menu selection:");
            System.out.println("1 - List Books.");
            System.out.println("2 - List Books Alphabetically.");
            System.out.println("3 - Lookup Book Author.");
            System.out.println("4 - Lookup Price.");
            System.out.println("5 - Search By Author.");
            System.out.println("6 - Search By Cost.");
            System.out.println("7 - Search By Book Title.");
            System.out.println("8 - Find Cheapest Book.");
            System.out.println("9 - Quit.");

            String s = JOptionPane.showInputDialog(null, "Please make a selection.");
            option = Integer.parseInt(s);
            if (option == 1) {
                System.out.println(bookStore.toString());
            } else if (option == 2) {
                bookStore.library.sortList();
                System.out.println(bookStore.toString());
            } else if (option == 3) {
                s = JOptionPane.showInputDialog(null, "Please Enter a Book Title.");
                String s1 = bookStore.loopupAuther(s);
                System.out.println("The Author for " + s + " is " + s1);
            } else if (option == 4) {
                s = JOptionPane.showInputDialog(null, "Please Enter a Book Title");
                double d = bookStore.lookUpPrice(s);
                System.out.println("The Price for " + s + " is " + d);
            } else if (option == 5) {
                s = JOptionPane.showInputDialog(null, "Please Enter an Author.");
                BookList list1 = bookStore.searchForAuther(s);
                System.out.println("List of books by the author is: ");
                for (Book b : list1) {
                    System.out.println(b.toString());
                }
            } else if (option == 6) {
                s = JOptionPane.showInputDialog(null, "Please enter a minimum cost.");
                BookList list2 = bookStore.searchForPrice(s);
                System.out.println("List of books below the " + s + " cost:");
                for (Book b : list2) {
                    System.out.println(b.toString());
                }
            } else if (option == 7) {
                s = JOptionPane.showInputDialog(null, "Please enter a Book Title.");
                BookList list3 = bookStore.searchForTitle(s);
                System.out.println("List of Books matching " + s);
                for (Book b : list3) {
                    System.out.println(b.toString());
                }
            } else if (option == 8) {
                System.out.println("Cheapest Book: "
                        + bookStore.getLowestPrice());
            } else {
                System.out.println("Thank you for using our program.");
                break;
            }

        }

    }
}
