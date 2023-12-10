package com.spring.jdbc.dao;

import com.spring.jdbc.dao.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private Student student;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    // @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Student getStudent(int studentId) {
            // select single student data
        String query = "SELECT * FROM springjdbc.student WHERE ID=?;";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        this.student = jdbcTemplate.queryForObject(query, rowMapper, studentId);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        // select all student data
        String query = "SELECT * FROM springjdbc.student;";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        List<Student> studentList = jdbcTemplate.query(query, rowMapper);
        return studentList;
    }
}
