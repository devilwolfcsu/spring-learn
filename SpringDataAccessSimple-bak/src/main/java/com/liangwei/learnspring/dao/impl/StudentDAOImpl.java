package com.liangwei.learnspring.dao.impl;

import com.liangwei.learnspring.dao.StudentDAO;
import com.liangwei.learnspring.domain.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.util.StringUtils;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by liangwei on 2017/3/27.
 */
public class StudentDAOImpl  implements StudentDAO{


    private JdbcTemplate jdbcTemplate;

    //private JdbcDaoSupport jdbcDaoSupport;

    public int queryStudentNum() {
        int rowCount = this.jdbcTemplate.queryForObject("select count(*) from student", Integer.class);
        return rowCount;
    }

    public String queryStudentNameById(int studentId) {

        String name = this.jdbcTemplate.queryForObject("select name from student where id = ? and gender=? ",new Object[]{1,"F"},String.class);
        return name;
    }

    public Student queryStudent(int studentId) {
        Student student = this.jdbcTemplate.queryForObject("select * from student where id = ?", new Object[]{1},
                new RowMapper<Student>() {
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

                Student tmp = new Student();
                tmp.setId(Integer.parseInt(rs.getString("id")));
                tmp.setName(rs.getString("name"));
                tmp.setGender(rs.getString("gender"));
                tmp.setAge(Integer.parseInt(rs.getString("age")));
                return tmp;

            }
        });
        return student;
    }

    public List<Student> queryStudents() {

        int num =0;
        List<Student> students = this.jdbcTemplate.query("select * from student", new RowMapper<Student>() {
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student tmp = new Student();
                tmp.setId(Integer.parseInt(rs.getString("id")));
                tmp.setName(rs.getString("name"));
                tmp.setGender(rs.getString("gender"));
                tmp.setAge(Integer.parseInt(rs.getString("age")));
                return tmp;

            }
        });
        return students;
    }

    public void insertStudent(Student student) {
        this.jdbcTemplate.update(
                "insert into student (id,name,gender,age)\n" +
                        "values(?,?,?,?)",
                student.getId(),student.getName(),student.getGender(),student.getAge());
    }

    public void updateStudentGender(Student student) {

        this.jdbcTemplate.update("UPDATE student  set gender=? where id = ?",student.getGender(),student.getId());
    }

    public void deleteStudentById(Student student) {
        this.jdbcTemplate.update("delete from student where id=?",student.getId());
    }


    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
}
