package com.liangwei.learnspring.service;

import com.liangwei.learnspring.domain.Course;
import com.liangwei.learnspring.domain.Score;
import com.liangwei.learnspring.domain.Student;

import java.util.List;

/**
 * 学生查询服务
 * Created by liangwei on 2017/3/21.
 */
public interface StudentQueryService {


    /**
     * 根据学生ID查询学生所有的课程考试信息
     * @param studentId 学生ID
     * @return 所有课程考试信息
     */
    List<Score> queryAllScoreByStudentId(int studentId);

    /**
     * 根据学生ID查询学生所有课程
     * @param studentId 学生ID
     * @return  学生所选课程
     */
    List<Course> queryAllCourseByStudentId(int studentId);


    Student  queryStdent(String name,int age);
    //...

}
