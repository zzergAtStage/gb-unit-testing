package seminars.fourth.hw;

public class App {
    public static void main(String[] args) {
        BookRepository bookRepository = new InMemoryBookRepository();
        BookService bookService = new BookService(bookRepository);
        System.out.println(bookService.findBookById("1"));
    }
}
