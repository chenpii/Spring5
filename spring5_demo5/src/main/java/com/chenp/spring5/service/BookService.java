package com.chenp.spring5.service;

import com.chenp.spring5.dao.BookDao;
import com.chenp.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenpi
 * @create 2022-10-13 22:00
 */
@Service
public class BookService {
    //注入dao
    @Autowired
    private BookDao bookDao;

    //添加的方法
    public void addBook(Book book) {
        bookDao.add(book);
    }

    //修改的方法
    public void updateBook(Book book) {
        bookDao.update(book);
    }

    //删除的方法
    public void deleteBook(Integer bookID) {
        bookDao.delete(bookID);
    }

    //查询条数
    public Integer queryCount() {
        return bookDao.queryCount();
    }

    //查询单个图书
    public Book queryBookByID(Integer bookId) {
        return bookDao.queryBookByID(bookId);
    }

    //查询图书列表
    public List<Book> queryBookList() {
        return bookDao.queryBookList();
    }

    //批量添加
    public int[] batchAdd(List<Object[]> batchArgs) {
        return bookDao.batchAdd(batchArgs);
    }

    //批量修改
    public int[] batchUpdate(List<Object[]> batchArgs) {
        return bookDao.batchUpdate(batchArgs);
    }

    //批量删除
    public int[] batchDelete(List<Object[]> batchArgs) {
        return bookDao.batchDelete(batchArgs);
    }

}
