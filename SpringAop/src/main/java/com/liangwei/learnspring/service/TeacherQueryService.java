package com.liangwei.learnspring.service;

/**
 * 教师查询服务
 * Created by liangwei on 2017/3/22.
 */
public interface TeacherQueryService {

    /* 根据班级ID查询该班级人数*/
    int  queryStudentNumByCourseId(int courseId);
}
