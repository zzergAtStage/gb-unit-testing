package seminars.fourth.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {
    @Mock
    BookRepository bookRepositoryMock;
    @InjectMocks
    BookService bookService;
    Book expectedBook;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

    }

    @Test
    void findBookById_ShouldReturnExpectedBook() {
        //Поскольку BookRepository является внешней зависимостью, а текущий unit-тест проверяет поведение только BookService
        // то для теста метода используется Mock объект, при этом исключается зависимость от поведения внешней зависимости.
        String bookId = "3";
        expectedBook = new Book("3","The Old Man and the See", "E. Hamingway");
        when(bookRepositoryMock.findById(bookId)).thenReturn(expectedBook);
        //Собственно тест поведения
        Book actualBook = bookService.findBookById(bookId);
        assertEquals(expectedBook, actualBook);
        verify(bookRepositoryMock, times(1)).findById(bookId);
    }

    @Test
    void findAll_BooksShouldReturnAllBooks() {

        List<Book> expectedBooks = Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")
        );
        when(bookRepositoryMock.findAll()).thenReturn(expectedBooks);

        List<Book> actualBooks = bookService.findAllBooks();

        // Assert
        assertEquals(expectedBooks, actualBooks);
        verify(bookRepositoryMock, times(1)).findAll();
    }
}