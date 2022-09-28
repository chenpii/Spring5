package com.atguigu.spring5;

/**
 * 使用有参构造注入
 *
 * @author chenpi
 * @create 2022-09-28 23:01
 */
public class Orders {
    //创建属性
    private String oname;
    private String address;
    //创建属性有参构造
    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oname='" + oname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
