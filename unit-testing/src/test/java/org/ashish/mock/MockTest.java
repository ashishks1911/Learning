package org.ashish.mock;

import org.junit.Test;
import org.mockito.Mockito;

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

    @Test
    public void moctTestWithMockito(){
        BookRepository bookRepository = Mockito.mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        Book book1 = new Book(502,"Communication",6000, LocalDate.now());
        Book book2 = new Book(503,"Hello Mini",600, LocalDate.now());

        bookService.addBook(book1);
        bookService.addBook(book2);

        //to verify if save was invoked...
        Mockito.verify(bookRepository).save(book1);
        //Mockito.verify(bookRepository).save(book2);

        //how many times save was called for a particular book...
        Mockito.verify(bookRepository,Mockito.times(1)).save(book1);
        Mockito.verify(bookRepository,Mockito.times(0)).save(book2);

    }
}
