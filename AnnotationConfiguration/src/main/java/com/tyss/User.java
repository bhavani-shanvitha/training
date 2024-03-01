package com.tyss;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component//that cls we will be consider as component cls
public class User {
	@Value(value="101")
	private int id;
	
	@Value(value="shan")
	private String name;
	
	@Value(value="shan@gmail.com")
	private String email;
	
	@Autowired
	@Qualifier(value="laptop")//if there are two primary beans at a time
	private Computer com;
	
	@Autowired
	private ArrayList nums;
	@Autowired
	private HashSet set;
	
	public Computer getCom() {
		return com;
	}
	public void setCom(Computer com) {
		this.com = com;
	}
	public ArrayList getNums() {
		return nums;
	}
	public void setNums(ArrayList nums) {
		this.nums = nums;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", com=" + com + ", nums=" + nums + ", set="
				+ set + "]";
	}
	public void code() {
		com.compile();
	}
}
