import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Library library;
    Borrower borrower;
    Book book;

    @Before
    public void setup(){
        borrower = new Borrower();
        library = new Library(10);
        book = new Book("The Great Gatsby");
    }

    @Test
    public void borrowTakesBookFromLibrary(){
        borrower.borrowBook(library, book);
        assertEquals(1, borrower.collectionSize());
        assertEquals(0, library.countBooks());
    }
}
