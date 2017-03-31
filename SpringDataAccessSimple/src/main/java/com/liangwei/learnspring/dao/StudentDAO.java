package com.liangwei.learnspring.dao;

import com.liangwei.learnspring.domain.Student;

import java.util.List;

/**
 * Created by liangwei on 2017/3/27.
 */
public interface StudentDAO {

    int queryStudentNum();

    String queryStudentNameById(int studentId);

    Student queryStudent(int studentId);

    List<Student> queryStudents();

    void insertStudent(Student student);

    void updateStudentGender(Student student);

    void deleteStudentById(Student student);
}
