package com.chenp.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @author chenpi
 * @create 2022-10-08 22:20
 */
@Repository
public class UserDaoImpl implements UserDao{
    public void add() {
        System.out.println("dao add........");
    }
}
