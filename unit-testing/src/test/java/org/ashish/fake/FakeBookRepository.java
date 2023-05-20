package org.ashish.fake;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeBookRepository implements BookRepository {
    Map<Integer,Book> bookstore = new HashMap<>();
    @Override
    public void save(Book book) {
        bookstore.put(book.getBook_id(),book);
    }

    @Override
    public Collection<Book> findAll() {
        return bookstore.values();
    }
}
