package com.liangwei.learnspring;

import com.liangwei.learnspring.dao.StudentDAO;
import com.liangwei.learnspring.dao.StudentDAOSupport;
import com.liangwei.learnspring.dao.StudentMapper;
import com.liangwei.learnspring.domain.Student;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.StringUtils;

import java.util.Set;

/**
 *
 * Created by liangwei on 2017/2/15.
 */
public class Application {

    public static void main(String[] args){


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dao.xml");


        /*  获取bean */
        StudentDAO studentDAO = applicationContext.getBean("studentDao", StudentDAO.class);

        /* 获取学生数量 */
        System.out.println(studentDAO.getStudentNums());

        /* 查找学生ID为1 的学生信息*/
        System.out.println(studentDAO.getStudentById(1));

        Student student = new Student();
        student.setId(3);
        student.setName("Jane");
        student.setGender("F");
        student.setAge(20);
        /* 插入新数据 */
        studentDAO.insertStudent(student);
        /* 查询新插入的数据，ID=3 */
        System.out.println(studentDAO.getStudentById(3));

        student.setGender("M");
        /* 更新学生数据信息，将性别改为M */
        studentDAO.updateStudent(student);
        System.out.println(studentDAO.getStudentById(3));

        studentDAO.deleteStudent(3);


        /*  SqlSessionDaoSupport使用  */

        StudentDAOSupport studentDAOSupport = applicationContext.getBean("studentDaoSupport", StudentDAOSupport.class);

        System.out.println(studentDAOSupport.getStudentNums());

        System.out.println(studentDAOSupport.getStudentById(1));
        student.setGender("F");
        studentDAOSupport.insertStudent(student);
        System.out.println(studentDAOSupport.getStudentById(3));

        student.setGender("M");
        studentDAOSupport.updateStudent(student);
        System.out.println(studentDAOSupport.getStudentById(3));
        studentDAOSupport.deleteStudent(3);

        /* StudentMapper */
        StudentMapper studentMapper = applicationContext.getBean("studentMapper", StudentMapper.class);

        System.out.println(studentMapper.getStudentNums());

        System.out.println(studentMapper.getStudentById(1));

        student.setGender("F");
        studentMapper.insertStudent(student);

        System.out.println(studentMapper.getStudentById(3));
        student.setGender("M");
        studentMapper.updateStudent(student);
        System.out.println(studentMapper.getStudentById(3));

        studentMapper.deleteStudent(3);

    }
}
