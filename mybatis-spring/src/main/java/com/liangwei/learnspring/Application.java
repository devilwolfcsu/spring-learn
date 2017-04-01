package com.liangwei.learnspring;

import com.liangwei.learnspring.dao.StudentDAO;
import com.liangwei.learnspring.dao.StudentDAOSupport;
import com.liangwei.learnspring.dao.StudentMapper;
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


        StudentDAO studentDAO = applicationContext.getBean("studentDao", StudentDAO.class);

        System.out.println(studentDAO.getStudentNums());

        System.out.println(studentDAO.getStudentById(1));

        StudentDAOSupport studentDAOSupport = applicationContext.getBean("studentDaoSupport", StudentDAOSupport.class);

        System.out.println(studentDAOSupport.getStudentNums());

        System.out.println(studentDAOSupport.getStudentById(1));

        StudentMapper studentMapper = applicationContext.getBean("studentMapper", StudentMapper.class);

        System.out.println(studentMapper.getStudentNums());

        System.out.println(studentMapper.getStudentById(1));
    }
}
