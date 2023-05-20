package org.ashish.fake;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
public class FakeTest {
    @Test
    public void testFake(){
        BookRepository bookRepository = new FakeBookRepository();
        BookService bookservice = new BookService(bookRepository);

        bookservice.addBook(new Book(101,"java",1500, LocalDate.now()));
        bookservice.addBook(new Book(102,"python",1000, LocalDate.now()));

        assertEquals(2,bookRepository.findAll().size());
    }

    @Test
    public void testFakeWithMockito(){
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        Book book1 = new Book(101,"java",1500, LocalDate.now());
        Book book2 = new Book(102,"python",1500, LocalDate.now());

        Collection<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        //Stubbing......
        when(bookRepository.findAll()).thenReturn(books);

        assertEquals(2,bookService.findNumberofBooks());
    }


}
