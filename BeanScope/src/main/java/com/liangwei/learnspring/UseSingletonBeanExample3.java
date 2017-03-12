package com.liangwei.learnspring;

/**
 * Created by liangwei on 2017/3/12.
 */
public class UseSingletonBeanExample3 {

    private SingletonBean singletonBean;

    public SingletonBean getSingletonBean() {
        return singletonBean;
    }

    public void setSingletonBean(SingletonBean singletonBean) {
        this.singletonBean = singletonBean;
    }
}
