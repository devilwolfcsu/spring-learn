package com.liangwei.learnspring.dao;

import com.liangwei.learnspring.domain.Student;

/**
 * Created by liangwei on 2017/4/1.
 */
public interface StudentDAOSupport {

    Student getStudentById(int studentId);

    int getStudentNums();
}
