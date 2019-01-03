package com.itcast.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTemplateUtils {
    private static ComboPooledDataSource dataSource = null;
    private static JdbcTemplate jdbcTemplate = null;


    static  {
        dataSource = new ComboPooledDataSource();
    }


    /**
     * 获取jdbcTemplate
     * @return
     */
    public static  JdbcTemplate getJdbcTemplate(){
        jdbcTemplate = new JdbcTemplate(dataSource);
        return  jdbcTemplate;
    }
}
