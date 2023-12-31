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

    @Override
    public int change(Student student) {
        // update query
        String query = "UPDATE springjdbc.student SET NAME=?, CITY=? WHERE ID=?;";
        int updateCount = jdbcTemplate.update(query,student.getName(), student.getCity(),student.getId());
        System.out.println("Number of record updated : "+updateCount);
        return updateCount;
    }

    @Override
    public int delete(int studentId) {
        // delete query
        String query = "DELETE FROM springjdbc.student WHERE ID=?;";
        int deleteCount = jdbcTemplate.update(query,studentId);
        System.out.println("Number of record deleted : "+deleteCount);
        return deleteCount;
    }
}
