package com.example.demo.bulider.manoeuvre;

/**
 * @Auther: wangzhendong
 * @Date: 2019/10/14 14:21
 * @Description: 建造者，构建产品的抽象
 */
public abstract class Builder {
    //构建产品的内部
    public abstract void setPart();
    //
    public abstract Product buildProduct();

}
