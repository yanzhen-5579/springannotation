package com.yanzhen.annotation.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insert(){
        String sql = "insert into tbl_user(username,age) values(?,?)";
        jdbcTemplate.update(sql, UUID.randomUUID().toString().substring(0,5),19);
    }
}
