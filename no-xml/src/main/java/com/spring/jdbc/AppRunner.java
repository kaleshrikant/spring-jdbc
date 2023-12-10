package com.spring.jdbc;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.config.JdbcConfig;
import com.spring.jdbc.dao.entity.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDaoImpl = context.getBean("studentDao",StudentDao.class);

        List<Student> students = new ArrayList<Student>();
            students = studentDaoImpl.getAllStudents();
                students
                        .stream()
                        .forEach(System.out::print);
                /* O/P
                    Student{id=111, name='Shrikant kale', city='Amravati'}
                    Student{id=222, name='Prashant Kale', city='Pune'}
                    Student{id=333, name='Shrikant Kale', city='Amravati'}
                 */
        context.close();
    }
}