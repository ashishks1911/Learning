package org.ashish.mock;

import org.ashish.spy.Book;
import org.ashish.spy.BookService;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class SpyTest {

    @Test
    public void spyTest(){
        BookRepositorySpy bookRepository = new BookRepositorySpy();
        org.ashish.spy.BookService bookService = new BookService(bookRepository);

        org.ashish.spy.Book book1 = new org.ashish.spy.Book(502,"Communication",6000, LocalDate.now());
        org.ashish.spy.Book book2 = new org.ashish.spy.Book(503,"Hello Mini",2600, LocalDate.now());
        org.ashish.spy.Book book3 = new Book(603,"Yourself",4500,LocalDate.now());

        bookService.addBook(book1);
        bookService.addBook(book2);

        Assert.assertEquals(2,bookRepository.saveCalled);
        Assert.assertTrue(bookRepository.calledWith(book2));

    }
}
