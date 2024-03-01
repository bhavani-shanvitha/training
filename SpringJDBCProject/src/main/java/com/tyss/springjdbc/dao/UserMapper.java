package com.tyss.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.tyss.springjdbc.entity.User;

@Component
public class UserMapper implements RowMapper<User>{
	@Autowired
	User user;
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		user.setId(rs.getInt(1));
		user.setName(rs.getString(2));
		user.setEmail(rs.getString(3));
		return user;
	}

}
