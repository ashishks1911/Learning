package org.ashish.spy;

public class BookRepositorySpy implements BookRepository {
    public int saveCalled =0;
    Book lastBookAdded = null;
    @Override
    public void save(Book book) {
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
