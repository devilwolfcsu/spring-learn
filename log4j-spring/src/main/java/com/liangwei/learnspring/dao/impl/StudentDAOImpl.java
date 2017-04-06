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

    public void insertStudent(Student student) {
        sqlSession.insert("insertStudent",student);
    }

    public void deleteStudent(int studentId) {
        sqlSession.delete("deleteStudent",studentId);
    }

    public void updateStudent(Student student) {
        sqlSession.update("updateStudent",student);
    }

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }
}
