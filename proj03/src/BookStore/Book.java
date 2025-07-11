package BookStore;

public class Book {

    String title;
    String author;
    double price;
    boolean hardCover;
    int isbn;
    
    

    public Book() {
        title = "";
        author = "";
        price = 0.0;
        hardCover = false;
        isbn = 000000;
    }

    public Book(String newTitle, String newAuthor, double newPrice) {
        title = newTitle;
        author = newAuthor;
        price = newPrice;
        
        
    }
     
    public Book(String newTitle, String newAuthor, double newPrice, boolean newHardCover){
        title = newTitle;
        author = newAuthor;
        price = newPrice;
        hardCover = newHardCover;
    }
    
    public Book(String newTitle, String newAuthor, double newPrice, boolean newHardCover, int newISBN){
        title = newTitle;
        author = newAuthor;
        price = newPrice;
        hardCover = newHardCover;
        isbn = newISBN;
    }
    
    public int getISBN(){
        return isbn;
    }
    
    public boolean getHardCover(){
        return hardCover;
    }
    
    public String getTitle() {
        return title;
    }
    @Deprecated
    public String getAuther() {
        return getAuthor();
    }
    
    public String getAuthor(){
        return author;
    }
    public double getPrice() {
        return price;
    }
    @Deprecated
    public double getCost() {
        return price;
    }

    @Override
    public String toString() {
        return ("title: " + title + "\t"
                + "author: " + author + "\t"
                + "price: " + price + "\t"
                + "hardcover: " + hardCover + "\t"
                + "isbn: " + isbn);

    }
    
    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }
        if(!(o instanceof Book)){
            return false;
        }
        
        Book otherBook = (Book) o;
        return this.getTitle().equals(otherBook.getTitle()) &&
                this.getAuthor().equals(otherBook.getAuthor()) &&
                this.getPrice() == otherBook.getPrice() &&
                this.getISBN() == otherBook.getISBN() &&
                this.getHardCover() == otherBook.getHardCover();
    }



}
