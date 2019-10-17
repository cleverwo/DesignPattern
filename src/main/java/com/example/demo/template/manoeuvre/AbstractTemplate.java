package com.example.demo.template.manoeuvre;

/**
 * @Auther: wangzhendong
 * @Date: 2019/10/14 13:32
 * @Description: 抽象模板，共有方法
 */
public abstract class AbstractTemplate {

    //基本方法 不同类实现方式不同,基本方法也叫做基本操作，是由子类实现的方法，并且在模板方法中被调用。
    public abstract void method();

    public abstract void method2();

    //模板方法 可以有一个或者几个，一般是具体的方法，也就是一个框架，实现对基本方法的调度，完成固定的逻辑。
    public final void common(){
        this.method();
        this.method2();
    }
}
