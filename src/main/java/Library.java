import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;

 public Library(int capacity){
     this.capacity = capacity;
     this.stock = new ArrayList<Book>();
 }

    public void addBook(Book book) {
        if (capacity > countBooks()) {
            this.stock.add(book);
        }
    }

    public void removeBook(Book book){
     this.stock.remove(book);
    }

    public int countBooks() {
    return this.stock.size();
    }
}
