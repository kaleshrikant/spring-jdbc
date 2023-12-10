package com.spring.jdbc.dao;

import com.spring.jdbc.dao.entity.Student;

import java.util.List;

public interface StudentDao {
    public Student getStudent(int studentId);

    public List<Student> getAllStudents();
}
