package com.itcast.dao;

import com.itcast.beans.User;
import com.itcast.utils.JDBCTemplateUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDao {
    public User findUserByName(String name){
        JdbcTemplate jdbcTemplate = JDBCTemplateUtils.getJdbcTemplate();
        String sql = "select * from user where userName=?";
        User user = null;

        try {
            user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), name);
        } catch (DataAccessException e) {
            System.out.println();
        }

        return user;
    }

    public boolean regist(User user) {
        JdbcTemplate jdbcTemplate = JDBCTemplateUtils.getJdbcTemplate();
        String sql = "INSERT INTO `user` VALUES(NULL,?,?,?,?,?,?,?)";
        int update = jdbcTemplate.update(sql, user.getUserName(), user.getPassword(),
                user.getGender(), user.getHobby(), user.getBirthday(), user.getCity(),
                user.getDescription());
        return update > 0;
    }

    public List<User> queryUserByName(String name) {
        String sql = "select * from user where username=?";
        JdbcTemplate jdbcTemplate = JDBCTemplateUtils.getJdbcTemplate();
        List<User> l = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class), name);
        return l;
    }
}
