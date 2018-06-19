import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setup(){
        book = new Book("The Great Gatsby", "fiction");
    }

    @Test
    public void bookHasName(){
        assertEquals("The Great Gatsby", book.getName());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("fiction", book.getGenre());
    }
}
