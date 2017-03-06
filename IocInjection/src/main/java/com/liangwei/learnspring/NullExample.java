package com.liangwei.learnspring;

/**
 * 空注入
 * Created by liangwei on 2017/3/6.
 */
public class NullExample {

    private String nullString;

    private String emptyString;

    public String getNullString() {
        return nullString;
    }

    public void setNullString(String nullString) {
        this.nullString = nullString;
    }

    public String getEmptyString() {
        return emptyString;
    }

    public void setEmptyString(String emptyString) {
        this.emptyString = emptyString;
    }
}
