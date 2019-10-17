package com.example.demo.bulider.manoeuvre;


/**
 * @Auther: wangzhendong
 * @Date: 2019/10/14 14:46
 * @Description:
 */
public class ConcreteBuilder extends Builder{
    Product product = new Product();

    @Override
    public void setPart() {
        product.setName("good");
        product.doSomething();
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
