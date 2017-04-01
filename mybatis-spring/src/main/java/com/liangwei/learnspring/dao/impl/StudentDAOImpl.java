package com.liangwei.learnspring.dao.impl;

import com.liangwei.learnspring.dao.StudentDAO;
import com.liangwei.learnspring.domain.Student;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by liangwei on 2017/4/1.
 */
public class StudentDAOImpl implements StudentDAO{

    private SqlSession sqlSession;

    public Student getStudentById(int studentId) {
        return sqlSession.selectOne("getStudentById",studentId);
    }

    public int getStudentNums() {

        return  sqlSession.selectOne("getStudentNums");
    }

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }
}
