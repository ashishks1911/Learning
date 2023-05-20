package org.ashish.dummy;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class DummyTest {

    @Test
    public void dummyTest(){
        BookRepository bookRepository = new FakeBookRepository();
        EmailService emailService = new DummyEmailService();
        BookService bookservice = new BookService(bookRepository,emailService);

        bookservice.addBook(new Book(101,"java",1500, LocalDate.now()));
        bookservice.addBook(new Book(102,"python",1000, LocalDate.now()));

        assertEquals(2,bookRepository.findAll().size());
    }
}
