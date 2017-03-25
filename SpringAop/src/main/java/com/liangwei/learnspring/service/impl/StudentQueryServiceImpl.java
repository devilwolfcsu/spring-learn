package com.liangwei.learnspring.service.impl;

import com.liangwei.learnspring.domain.Course;
import com.liangwei.learnspring.domain.Score;
import com.liangwei.learnspring.domain.Student;
import com.liangwei.learnspring.service.StudentQueryService;

import java.util.List;

/**
 * 学生查询服务实现类
 * Created by liangwei on 2017/3/21.
 */
public class StudentQueryServiceImpl implements StudentQueryService {

    public List<Score> queryAllScoreByStudentId(int studentId) {

        System.out.println("queryAllScoreByStudentId");

        return null;
    }

    public List<Course> queryAllCourseByStudentId(int studentId) {
        return null;
    }

    public Student queryStdent(String name, int age) {

        //return  new Student(name,age);
        return null;
    }
}
