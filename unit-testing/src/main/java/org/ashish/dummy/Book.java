package org.ashish.dummy;

import java.time.LocalDate;

public class Book {
    private int book_id;
    private String title;
    private int price;
    private LocalDate publishedDate;

    public Book(int book_id, String title, int price, LocalDate publishedDate) {
        this.book_id = book_id;
        this.title = title;
        this.price = price;
        this.publishedDate = publishedDate;
    }


    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }
}
