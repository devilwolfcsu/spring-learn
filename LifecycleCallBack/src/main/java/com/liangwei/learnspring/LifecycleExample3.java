package com.liangwei.learnspring;

/**
 * 该类用于展示特定的初始化方式
 * Created by liangwei on 2017/3/16.
 */
public class LifecycleExample3 {

    public void anotherInit(){
        System.out.println("LifecycleExample3 anotherInit method called1");
    }

    public void init(){
        System.out.println("LifecycleExample3 init method called!");
    }
}
