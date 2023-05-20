package org.ashish.mock;

import org.ashish.spy.Book;
import org.ashish.spy.BookRepository;

public class BookRepositorySpy implements BookRepository {
    int saveCalled =0;
    org.ashish.spy.Book lastBookAdded = null;
    @Override
    public void save(org.ashish.spy.Book book) {
        saveCalled++;
        lastBookAdded=book;
    }

    public int timesCalled(){
        return saveCalled;
    }

    public boolean calledWith(Book book){
        return lastBookAdded.equals(book);
    }
}
