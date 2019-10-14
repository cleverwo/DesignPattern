package com.example.demo.template.manoeure;

/**
 * @Auther: wangzhendong
 * @Date: 2019/10/14 13:55
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        AbstractTemplate template1 = new ConcreteClass1();
        AbstractTemplate template2 = new ConcreteClass2();
        template1.common();
        template1.common();
    }
}
