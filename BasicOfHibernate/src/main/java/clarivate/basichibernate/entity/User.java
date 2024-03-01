package clarivate.basichibernate.entity;

import javax.persistence.Entity;
import javax.persistence.*;
@Entity  //in hibernate for entity class we use @entity
public class User {
	@Id//for primarykey we use annotation as @
	private int userId;
	private String username;
	@Column(unique=true)
	private String userEmail;
	private String userPassword;
	private int age;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + ", age=" + age + "]";
	}
	
	
}
