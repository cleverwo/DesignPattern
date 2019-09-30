package com.example.demo.singleton.demo;

/**
 * @Auther: wangzhendong
 * @Date: 2019/8/27 09:24
 * @Description:
 */
public class Emperor {
    private static final Emperor emperor = new Emperor();

    private Emperor() {
    }

    public static Emperor getInstance() {
        return emperor;
    }

    public static void say(){
        System.out.println("emperor running the extra mile...");
    }

}
