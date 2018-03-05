package com.silence.dao;

import com.silence.domain.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<TUser> showAllUser() {
        return jdbcTemplate.query("select * from t_user", (RowMapper<TUser>) (rs, rowNum) -> {
            TUser user = new TUser();
            user.setUserName(rs.getString("user_name"));
            user.setPassword(rs.getString("password"));
            return user;
        });
    }
}
