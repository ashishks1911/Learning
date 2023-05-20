package org.ashish.annotations;

import org.ashish.stub.Book;
import org.ashish.stub.BookRepository;
import org.ashish.stub.BookService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Use @ExtendWith(MockitoExtension.class) with JUnit5
 * Use @RunWith(MockitoJUnitRunner.class) with JUnit4
 * Ways to configure junit annotations (1)
 */
@RunWith(MockitoJUnitRunner.class)
public class AnnotationTest {
    @InjectMocks
    private BookService bookService;
    @Mock
    private BookRepository bookRepository;
    @Test
    public void stubTestWithMockito(){

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
