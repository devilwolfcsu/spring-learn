package com.liangwei.learnspring;

/**
 * Prototype Bean例子
 * Created by liangwei on 2017/3/12.
 */
public class PrototypeBean {

    private static int  num = 0;

    private int count;
    public PrototypeBean() {
        num++;
        count = num;
    }

    public int getCount() {
        return count;
    }
}
