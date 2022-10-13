package com.chenp.spring5.entity;

/**
 * @author chenpi
 * @create 2022-10-13 22:30
 */
public class Book {
    private Integer bookId;
    private String bookName;
    private String bstatus;

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }



    public void setBstatus(String bstatus) {
        this.bstatus = bstatus;
    }
    public Integer getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBstatus() {
        return bstatus;
    }
}
