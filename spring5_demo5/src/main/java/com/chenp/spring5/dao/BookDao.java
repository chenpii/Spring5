package com.chenp.spring5.dao;

import com.chenp.spring5.entity.Book;

import java.util.List;

/**
 * @author chenpi
 * @create 2022-10-13 22:00
 */
public interface BookDao {
    //增加
    void add(Book book);

    //修改
    int update(Book book);

    //删除
    int delete(Integer bookID);

    //查询所有条数
    int queryCount();

    //查询当个图书
    Book queryBookByID(Integer bookId);

    //查询图书分页
    List<Book> queryBookList();
}
