package com.chenp.spring5.dao;

import com.chenp.spring5.entity.Book;
import com.mysql.cj.jdbc.result.UpdatableResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
}
