package BehaviouralPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BookCollectionsV1 {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
