package com.example.demo.bulider.manoeuvre;

/**
 * @Auther: wangzhendong
 * @Date: 2019/10/14 14:47
 * @Description:
 */
public class Director {
    Builder builder = new ConcreteBuilder();

    public Product getProduct(){
        builder.setPart();
        return builder.buildProduct();
    }
}
