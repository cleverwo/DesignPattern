package com.example.demo.factory.manoeure;

/**
 * @Auther: wangzhendong
 * @Date: 2019/10/12 10:31
 * @Description:
 */
public class ConcreteProduct1 extends Product{

    @Override
    public void method2() {
        super.method();
        System.out.println("产品实现类1");
    }
}
