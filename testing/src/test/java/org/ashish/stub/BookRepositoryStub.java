package org.ashish.stub;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookRepositoryStub implements BookRepository {
    @Override
    public List<Book> findNewBooks(int days) {
        List<Book> newBooks = new ArrayList<>();
        Book book1 = new Book(101,"java",2000, LocalDate.now());
        Book book2 = new Book(102,"python",1500, LocalDate.now());
        newBooks.add(book1);
        newBooks.add(book2);

        return newBooks;
    }
}
