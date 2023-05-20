package org.ashish.spy;

import org.ashish.mock.Book;
import org.ashish.mock.BookService;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class SpyTest {

    @Test
    public void spyTest(){
        BookRepositorySpy bookRepository = new BookRepositorySpy();
        org.ashish.mock.BookService bookService = new BookService(bookRepository);

        org.ashish.mock.Book book1 = new org.ashish.mock.Book(502,"Communication",6000, LocalDate.now());
        org.ashish.mock.Book book2 = new org.ashish.mock.Book(503,"Hello Mini",2600, LocalDate.now());
        org.ashish.mock.Book book3 = new Book(603,"Yourself",4500,LocalDate.now());

        bookService.addBook(book1);
        bookService.addBook(book2);

        Assert.assertEquals(2,bookRepository.saveCalled);
        Assert.assertTrue(bookRepository.calledWith(book2));

    }
}
