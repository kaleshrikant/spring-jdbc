package com.spring.jdbc;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.dao.entity.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class AppRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

            StudentDao studentDaoImpl = (StudentDao) context.getBean("studentDaoImpl", StudentDao.class);
            Student student = new Student(333, "Shrikant Kale", "Amravati");
                int result = studentDaoImpl.insert(student);
                System.out.println(result);

        context.close();
    }
}
