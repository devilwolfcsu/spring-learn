package com.liangwei.learnspring;

import com.liangwei.learnspring.service.StudentQueryService;
import com.liangwei.learnspring.service.TeacherQueryService;
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


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"bean.xml","interceptor.xml"});

        StudentQueryService service = applicationContext.getBean("studentService",StudentQueryService.class);
        service.queryAllCourseByStudentId(1234);
        service.queryAllScoreByStudentId(314);
        TeacherQueryService teacherQueryService = applicationContext.getBean("teacherQueryService",TeacherQueryService.class);
        int studentNum = teacherQueryService.queryStudentNumByCourseId(10100);
        System.out.println("query student num:"+studentNum);
    }
}
