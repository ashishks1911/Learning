package org.ashish.fake;

import org.ashish.fake.Book;

import java.util.Collection;

public interface BookRepository {

    void save(Book book);

    Collection<Book> findAll();
}
