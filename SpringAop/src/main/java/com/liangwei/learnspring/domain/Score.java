package com.liangwei.learnspring.domain;

/**
 * 课程分数
 * Created by liangwei on 2017/3/21.
 */
public class Score {

    /* 分数 */
    private int  score;

    /* 课程名称 */
    private String courseName;

    /*课程ID*/
    private int courseId;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
