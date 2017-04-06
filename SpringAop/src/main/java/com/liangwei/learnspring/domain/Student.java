package com.liangwei.learnspring.domain;



/**
 * 学生模型
 * Created by liangwei on 2017/3/21.
 */
public class Student extends Person {

    /* 学号 */
    private int  studentId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
