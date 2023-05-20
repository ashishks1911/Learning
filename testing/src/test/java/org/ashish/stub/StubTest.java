package org.ashish.stub;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class StubTest {

    @Test
    public void stubTest(){
        BookRepository bookRepository = new BookRepositoryStub();
        BookService bookService = new BookService(bookRepository);

        List<Book> discountedBooks = bookService.getNewBooksWithAppliedDiscount(20,7);

        Assert.assertEquals(2,discountedBooks.size());
        Assert.assertEquals(1600,discountedBooks.get(0).getPrice());

    }

    @Test
    public void stubTestWithMockito(){
        BookRepository bookRepository = Mockito.mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        List<Book> books = new ArrayList<>();
        Book book1 = new Book(402,"Hello",2000, LocalDate.now());
        Book book2 = new Book(402,"Hello",3000, LocalDate.now());

        books.add(book1);
        books.add(book2);
        Mockito.when(bookRepository.findNewBooks(7)).thenReturn(books);

        List<Book> newBooksWithAppliedDiscount = bookService.getNewBooksWithAppliedDiscount(20,7);
        Assert.assertEquals(2,newBooksWithAppliedDiscount.size());
        Assert.assertEquals(1600,newBooksWithAppliedDiscount.get(0).getPrice());
        Assert.assertEquals(2400,newBooksWithAppliedDiscount.get(1).getPrice());
    }
}
