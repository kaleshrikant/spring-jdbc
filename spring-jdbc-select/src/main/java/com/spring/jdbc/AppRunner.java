package com.spring.jdbc;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.entity.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
         StudentDao studentDaoImpl = context.getBean("studentDaoImpl",StudentDao.class);

        Student student = new Student();
            student.setId(333);
            Student studentFromDb = studentDaoImpl.getStudent(student.getId());
        System.out.println(studentFromDb);  // Student{id=333, name='Shrikant Kale', city='Amravati'}

        List<Student> students = new ArrayList<Student>();
            students = studentDaoImpl.getAllStudents();
                students
                        .stream()
                        .forEach(System.out::print);
        context.close();
    }
}