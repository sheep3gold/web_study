package com.itcast.test;

import com.itcast.beans.User;
import com.itcast.utils.JDBCTemplateUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class DBTest {
    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate =
                JDBCTemplateUtils.getJdbcTemplate();
        String sql = "select * from user where userName=?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), "b");
        System.out.println(user);
    }
}
