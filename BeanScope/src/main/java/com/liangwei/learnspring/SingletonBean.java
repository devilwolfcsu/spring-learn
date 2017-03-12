package com.liangwei.learnspring;

/**
 * SingletonBean 例子
 * Created by liangwei on 2017/3/12.
 */
public class SingletonBean {

    private static int num =0;

    private int count;

    public SingletonBean() {
        num++;
        count = num;
    }

    public int getCount() {
        return count;
    }
}
