package seminars.fourth.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {
    BookRepository bookRepositoryMock;
    BookService bookService;
    Book expectedBook;
    Book book2;
    @BeforeEach
    void setUp() {
        bookRepositoryMock = mock(InMemoryBookRepository.class);
        bookService = new BookService(bookRepositoryMock);
        expectedBook = new Book("3","The Old Man and the See", "E. Hamingway");
    }

    @Test
    void findBookById_ShouldReturnExpectedBook() {
        //Поскольку BookRepository является внешней зависимостью, а текущий unit-тест проверяет поведение только BookService
        // то для теста метода используется Mock объект, при этом исключается зависимость от поведения внешней зависимости.
        String bookId = "3";
        when(bookRepositoryMock.findById(bookId)).thenReturn(expectedBook);
        Book actualBook = bookService.findBookById("3");
        verify(bookRepositoryMock).findById("3");
        assertEquals(expectedBook, actualBook);
    }

    @Test
    void findAllBooks() {
    }
}