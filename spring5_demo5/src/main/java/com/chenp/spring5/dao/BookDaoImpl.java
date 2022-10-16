package com.chenp.spring5.dao;

import com.chenp.spring5.entity.Book;
import com.mysql.cj.jdbc.result.UpdatableResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author chenpi
 * @create 2022-10-13 22:01
 */
@Repository
public class BookDaoImpl implements BookDao {

    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        //1 创建sql语句
        String sql = "insert into t_book value(?,?,?)";
        //2 调用方法实现
        int update = jdbcTemplate.update(sql, book.getBookId(), book.getBookName(), book.getBstatus());
        System.out.println(update);
    }

    @Override
    public int update(Book book) {
        //1 创建sql语句
        String sql = "update t_book set bookName=?,bstatus=? where book_id=?";
        //2 调用方法实现
        int update = jdbcTemplate.update(sql, book.getBookName(), book.getBstatus(), book.getBookId());
        return update;
    }

    @Override
    public int delete(Integer bookId) {
        //1 创建sql语句
        String sql = "delete from t_book where book_id=?";
        //2 调用方法实现
        int update = jdbcTemplate.update(sql, bookId);
        return update;

    }

    @Override
    public int queryCount() {
        //1 创建sql语句
        String sql = "select count(1) from t_book";
        //2 调用方法实现
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        return integer;
    }

    @Override
    public Book queryBookByID(Integer bookId) {
        //1 创建sql语句
        String sql = "select * from t_book where book_id=?";
        //2 调用方法实现
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), bookId);
        return book;
    }

    @Override
    public List<Book> queryBookList() {
        //1 创建sql语句
        String sql = "select * from t_book";
        //2 调用方法实现
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }

    @Override
    public int[] batchAdd(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        return ints;
    }

    @Override
    public int[] batchUpdate(List<Object[]> batchArgs) {
        String sql = "update t_book set bookName=?,bstatus=? where book_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        return ints;
    }

    @Override
    public int[] batchDelete(List<Object[]> batchArgs) {
        String sql = "delete from t_book where book_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        return ints;
    }
}
