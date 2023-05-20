package org.ashish.stub;

import org.junit.Assert;
import org.junit.Test;
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
}
