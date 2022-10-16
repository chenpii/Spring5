package com.chenp.spring5.dao;

/**
 * @author chenpi
 * @create 2022-10-16 17:56
 */
public interface UserDao {
    public void addMoney(Integer money, String username);

    public void reduceMoney(Integer money, String username);
}
