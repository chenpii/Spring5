package com.chenp.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author chenpi
 * @create 2022-10-16 17:57
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 往账户加钱操作
     *
     * @param money
     * @param toName
     */
    @Override
    //@Transactional(propagation = Propagation.REQUIRED)
    public void addMoney(Integer money, String toName) {
        String sql = "update t_account set money=money+? where username=?";
        jdbcTemplate.update(sql, money, toName);
    }

    /**
     * 从账户扣钱操作
     *
     * @param money
     * @param fromName
     */
    @Override
    //@Transactional(propagation = Propagation.REQUIRED)
    public void reduceMoney(Integer money, String fromName) {
        String sql = "update t_account set money=money-? where username=?";
        jdbcTemplate.update(sql, money, fromName);

    }
}
