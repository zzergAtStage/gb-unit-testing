package seminars.fourth.hw;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book;
    private Book book2;

    @BeforeEach
    void setUp() {
        book = new Book("1", "The Great Gatsby", "F. Scott Fitzgerald");
        book2 = new Book("3");// "The Old Man and the See", "E. Hemingway" - will use later
    }

    @AfterEach
    void tearDown(){
        book = null;
        book2 = null;
    }
    @Test
    void constructorWithIdShouldSetId() {
        assertEquals("3", book2.getId());
        assertNull(book2.getTitle());
        assertNull(book2.getAuthor());
    }

    @Test
    void constructorWithTitleAndAuthorShouldSetValues() {
        Book anotherBook = new Book("2", "To Kill a Mockingbird", "Harper Lee");

        assertEquals("2", anotherBook.getId());
        assertEquals("To Kill a Mockingbird", anotherBook.getTitle());
        assertEquals("Harper Lee", anotherBook.getAuthor());
    }

    @Test
    void setIdShouldChangeId() {
        book.setId("4");
        assertEquals("4", book.getId());
    }

    @Test
    void setTitleShouldChangeTitle() {
        book.setTitle("The Catcher in the Rye");
        assertEquals("The Catcher in the Rye", book.getTitle());
    }

    @Test
    void setAuthorShouldChangeAuthor() {
        book.setAuthor("J.D. Salinger");
        assertEquals("J.D. Salinger", book.getAuthor());
    }

    @Test
    void gettersAndSettersShouldWorkCorrectly() {
        // Ensure that getters and setters work correctly together
        Book anotherBook = new Book("4");
        anotherBook.setTitle("1984");
        anotherBook.setAuthor("George Orwell");

        assertEquals("4", anotherBook.getId());
        assertEquals("1984", anotherBook.getTitle());
        assertEquals("George Orwell", anotherBook.getAuthor());
    }
}
