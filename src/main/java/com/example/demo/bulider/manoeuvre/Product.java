package com.example.demo.bulider.manoeuvre;

/**
 * @Auther: wangzhendong
 * @Date: 2019/10/14 14:21
 * @Description:
 */
public class Product {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //基本方法
    public void doSomething(){
        System.out.println("产品类业务实现");
    }
}
