package com.chenp.spring5.proxy;

import com.chenp.spring5.dao.UserDao;
import com.chenp.spring5.dao.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {

        UserDaoImpl userDao = new UserDaoImpl();

        //创建接口实现类的代理对象，代理对象和被代理对象实现同一个接口
        Class<?>[] interfaces = {UserDao.class};
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoHandler(userDao));

        System.out.println(dao.add(1, 2));
        dao.update("abc");
    }
}

//代理类的调用处理程序
class UserDaoHandler implements InvocationHandler {

    //1.把创建的是谁的代理对象，把谁传递过来
    //有参构造
    private Object obj;

    public UserDaoHandler(Object obj) {
        this.obj = obj;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法之前
        System.out.println("方法之前执行...." + method.getName() + ",传递的参数..." + Arrays.toString(args));
        //被增强的方法执行
        Object res = method.invoke(obj, args);
        //方法之后
        System.out.println("方法之后执行...." + obj);

        return res;
    }
}