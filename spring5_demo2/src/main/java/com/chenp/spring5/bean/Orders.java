package com.chenp.spring5.bean;

public class Orders {
    private String oname;

    //无参构造
    public Orders() {
        System.out.println("第一步：执行无参构造函数，创建bean实例");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步：调用set方法设置属性值");
    }

    //创建执行时的初始化方法
    public void initMethod(){
        System.out.println("第三步：调用初始化方法");
    }

    //创建销毁时执行的方法
    public void destroyMethod(){
        System.out.println("第五步：执行销毁的方法");
    }
}
