package com.spring.jdbc.dao.config;

import com.spring.jdbc.dao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class JdbcConfig {

    @Bean(name = { "dataSource" })
    public DataSource getDataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
            driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
            driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
            driverManagerDataSource.setUsername("user");
            driverManagerDataSource.setPassword("Kale@333");
        return driverManagerDataSource;
    }

    @Bean(name = { "jdbcTemplate" })
    public JdbcTemplate getJdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
            jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

    @Bean(name = { "studentDao" })
    public StudentDaoImpl getStudentDaoImpl() {
        StudentDaoImpl studentDao = new StudentDaoImpl();
            studentDao.setJdbcTemplate(getJdbcTemplate());
        return studentDao;
    }
}