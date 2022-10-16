package com.chenp.spring5.service;

import com.chenp.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author chenpi
 * @create 2022-10-16 17:58
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 转账
     *
     * @param money    转账金额
     * @param fromName 扣款人
     * @param toName   收款人
     */
    //2、声明式事务
    @Transactional(isolation = Isolation.REPEATABLE_READ,
            timeout = -1)
    public void transMoney(Integer money, String fromName, String toName) {

        //1、编程式事务
        // try {
        //     //第一步 开启事务
        //
        //
        //     //第二步 进行业务操作
        //     userDao.addMoney(money, payee);
        //
        //     //模拟异常
        //     int i = 10 / 0;
        //
        //     userDao.reduceMoney(money, payer);
        //
        //     //第三步 没有发生异常，提交事务
        // }catch (Exception e){
        //     //第四步 出现异常，事务回滚
        //
        // }

        userDao.reduceMoney(money, fromName);
        int i = 10 / 0;
        userDao.addMoney(money, toName);

    }

}
