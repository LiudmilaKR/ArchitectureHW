package seminar3hw.DIP;

import java.util.ArrayList;
import java.util.List;

public class ListRepository implements Repository {

    List<Book> bookList;

    public ListRepository() {
        bookList = new ArrayList<>();
    }

    @Override
    public List<Book> getAllBooks() {
        return bookList;
    }

    @Override
    public void addBook(Book book) {
        bookList.add(book);
    }
}
