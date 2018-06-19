import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public void borrowBook(Library library, Book book){
        library.addBook(book);
        library.removeBook(book);
        this.collection.add(book);

    }

    public int collectionSize() {
        return this.collection.size();
    }
}
