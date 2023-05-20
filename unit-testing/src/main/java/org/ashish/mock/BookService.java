package org.ashish.mock;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book){
        if(book.getPrice()<2000){
            return;
        }
        bookRepository.save(book);
    }

}
