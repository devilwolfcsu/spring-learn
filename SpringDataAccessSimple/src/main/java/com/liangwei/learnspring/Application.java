package com.liangwei.learnspring;

import com.liangwei.learnspring.dao.StudentDAO;
import com.liangwei.learnspring.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * Created by liangwei on 2017/2/15.
 */
public class Application {

    public static void main(String[] args){



        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"bean.xml","dao.xml"});


        System.out.println(System.getProperty("java.class.path"));
        StudentDAO studentDao = applicationContext.getBean("studentDao", StudentDAO.class);
        System.out.println(studentDao.queryStudentNum());
        System.out.println(studentDao.queryStudent(1));
        System.out.println(studentDao.queryStudentNameById(1));
        System.out.println(studentDao.queryStudents());

        Student student = new Student();
        student.setId(3);
        student.setName("Jane");
        student.setGender("M");
        student.setAge(18);

        studentDao.insertStudent(student);
        System.out.println(studentDao.queryStudents());

        student.setGender("F");
        studentDao.updateStudentGender(student);
        System.out.println(studentDao.queryStudents());

        studentDao.deleteStudentById(student);
        System.out.println(studentDao.queryStudents());


    }
}
