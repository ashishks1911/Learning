package org.ashish.spy;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class MockTest {

    @Test
    public void mockTest(){
        BookRepositoryMock bookRepository = new BookRepositoryMock();
        BookService bookService = new BookService(bookRepository);

        Book book1 = new Book(502,"Communication",6000, LocalDate.now());
        Book book2 = new Book(503,"Hello Mini",2600, LocalDate.now());
        Book book3 = new Book(603,"Yourself",4500,LocalDate.now());

        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);

        bookRepository.verify(book3,3);
    }
}
