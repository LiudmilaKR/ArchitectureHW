package seminar3hw.DIP;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileRepository implements Repository {

    String path;

    public FileRepository(String path) {
        this.path = path;
    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> bookList = new ArrayList<>();
        // реализация
        return bookList;
    }

    @Override
    public void addBook(Book book) {
        getAllBooks().add(book);
    }
}
