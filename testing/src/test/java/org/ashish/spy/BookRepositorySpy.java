package org.ashish.spy;

import org.ashish.mock.Book;
import org.ashish.mock.BookRepository;

public class BookRepositorySpy implements BookRepository {
    int saveCalled =0;
    org.ashish.mock.Book lastBookAdded = null;
    @Override
    public void save(org.ashish.mock.Book book) {
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
