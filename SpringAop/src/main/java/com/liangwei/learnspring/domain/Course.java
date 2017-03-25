package com.liangwei.learnspring.domain;

/**
 * 课程对象
 * Created by liangwei on 2017/3/21.
 */
public class Course {

    //课程ID
    private int courseId;

    //课程名
    private String courseName;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
