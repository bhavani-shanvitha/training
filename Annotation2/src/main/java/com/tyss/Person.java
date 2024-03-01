package com.tyss;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value(value="shanvitha")
	private String name;
	
	@Value(value="326788927100")
	private long adharno;
	
	@Value(value="5F7R123K0")
	private String panno;
	
	@Autowired
	private ArrayList<String> role;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	public ArrayList<String> getRole() {
		return role;
	}
	public void setRole(ArrayList<String> role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", adharno=" + adharno + ", panno=" + panno + ", role=" + role + "]";
	}
	
}
