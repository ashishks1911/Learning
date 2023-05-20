package org.ashish.spy;

import org.junit.Assert;

public class BookRepositoryMock implements BookRepository {
    int saveCalled =0;
    Book lastBookAdded = null;
    @Override
    public void save(Book book) {
        saveCalled++;
        lastBookAdded=book;
    }

    public void verify(Book book,int times){

        Assert.assertEquals(times,saveCalled);
        Assert.assertEquals(book,lastBookAdded);

    }
}
