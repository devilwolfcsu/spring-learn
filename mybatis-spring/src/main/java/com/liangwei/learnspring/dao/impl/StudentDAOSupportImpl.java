package com.liangwei.learnspring.dao.impl;

import com.liangwei.learnspring.dao.StudentDAOSupport;
import com.liangwei.learnspring.domain.Student;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Created by liangwei on 2017/4/1.
 */
public class StudentDAOSupportImpl  extends SqlSessionDaoSupport implements StudentDAOSupport {

    public Student getStudentById(int studentId) {
        return getSqlSession().selectOne("getStudentById",studentId);
    }

    public int getStudentNums() {
        return  getSqlSession().selectOne("getStudentNums");
    }
}
