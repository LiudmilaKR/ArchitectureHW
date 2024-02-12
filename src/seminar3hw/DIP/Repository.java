package seminar3hw.DIP;

import java.util.List;

public interface Repository {

    List<Book> getAllBooks();

    void addBook(Book book);
}
