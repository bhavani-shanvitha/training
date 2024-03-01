package com.tyss;

public class User {
	private int id;
	private String name;
	private String email;
	
	private Computer com;
	public User() {
		
	}
//public User(int id, String name, String email) {
//		
//		this.id = id;
//		this.name = name;
//		this.email = email;
//	}


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
	
	
	


//	public Laptop getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}


	public Computer getCom() {
		return com;
	}


	public void setCom(Computer com) {
		this.com = com;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", computer=" + com + "]";
	}
	public void code() {
		com.compile();
	}

}
