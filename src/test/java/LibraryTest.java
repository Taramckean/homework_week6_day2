import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
        Library library;
        Book book;

        @Before
        public void setup(){
            library = new Library(10);
            book = new Book("The Great Gatsby");
        }

        @Test
        public void libraryHasBooks(){
            library.addBook(book);
            assertEquals(1, library.countBooks());
        }

        @Test
        public void libraryCanTakeAwayBooks(){
            library.addBook(book);
            library.removeBook(book);
            assertEquals(0, library.countBooks());
        }

        @Test
        public void libraryDoesntAddBooksIfOverCapacity(){
          library = new Library(2);
          library.addBook(book);
          library.addBook(book);
          library.addBook(book);
          assertEquals(2, library.countBooks());
        }



    }

