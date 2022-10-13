package com.chenp.spring5.service;

import com.chenp.spring5.dao.BookDao;
import com.chenp.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
