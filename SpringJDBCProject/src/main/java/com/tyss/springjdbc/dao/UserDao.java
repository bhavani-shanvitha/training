package com.tyss.springjdbc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.tyss.springjdbc.entity.User;

@Component
public class UserDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	UserMapper userMapper;
	
	public int saveUser(User user) {
		String qry="insert into user values("+user.getId()+",'"+user.getName()+"','"+user.getEmail()+"')";
		return jdbcTemplate.update(qry);	
	}
	
	public int updateUser(int id,String updatedName) {
		String qry="update user set name='"+updatedName+"' where id=+"+id;
		return jdbcTemplate.update(qry);
	}
	
	public int deleteUserById(int id) {
		String qry="delete from user where id="+id;
		return jdbcTemplate.update(qry);
	}
	
	public List<Map<String,Object>> fetchAllUsers(){
		String qry="select * from user";
		return jdbcTemplate.queryForList(qry);
	}
	
	public User fetchUserById(int id) {
		String qry="select * from user where id="+id;
		return jdbcTemplate.queryForObject(qry,userMapper );
	}
}
