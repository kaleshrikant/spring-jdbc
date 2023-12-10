package com.spring.jdbc.dao;

import com.spring.jdbc.dao.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao{

    private JdbcTemplate jdbcTemplate;
    private Student student;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {
        // insert query
        String query = "INSERT INTO springjdbc.student (ID, NAME, CITY) VALUES (?, ?, ?);";
        int insertCount = jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
        System.out.println("Number of record inserted : "+insertCount);
        return insertCount;
    }
}
