package org.ashish.stub;

import java.util.List;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Book> getNewBooksWithAppliedDiscount(int discountRate,int days){
        List<Book> newBooks = bookRepository.findNewBooks(days);
        for (Book book : newBooks){
           int newprice = book.getPrice() - (book.getPrice()*discountRate/100);
           book.setPrice(newprice);
        }
        return newBooks;
    }

}
