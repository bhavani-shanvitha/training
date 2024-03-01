package basicofJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import basicofJDBC.User;

public class saveuserinfo2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		User user = readUserinfo(read);
		int numberOfRows = saveUser(user);
		if (numberOfRows == 1) {
			System.out.println(numberOfRows + " Row affected");
			System.out.println("User Saved in the DataBase");
		} else {
			System.out.println(numberOfRows + " Row affected");
			System.out.println("User Not Saved in the DataBase");
		}
	}

	public static int saveUser(User user) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int numberOfRows = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/userinfo?user=root&password=admin";
			connection = DriverManager.getConnection(dbUrl);
			String sqlQuery = "INSERT INTO user (user_id, user_name, user_email, user_password, user_age) VALUES (?, ?, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(sqlQuery);

			// Replace the place Holders with actual value
			preparedStatement.setInt(1, user.getUserId());
			preparedStatement.setString(2, user.getUserName());
			preparedStatement.setString(3, user.getUserEmail());
			preparedStatement.setString(4, user.getUserPassword());
			preparedStatement.setInt(5, user.getAge());

			numberOfRows = preparedStatement.executeUpdate();// insert, update or delete

		} catch (ClassNotFoundException | SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return numberOfRows;
	}

	public static User readUserinfo(Scanner read) {
		User user = new User();
		System.out.println("Enter the User Id : ");
		int id = read.nextInt();
		System.out.println("Enter the User Name : ");
		String userName = read.next();
		System.out.println("Enter the User Email : ");
		String userEmail = read.next();
		System.out.println("Enter the User Password : ");
		String userpassword = read.next();
		System.out.println("Enter the User Age : ");
		int age = read.nextInt();
		user.setUserId(id);
		user.setUserName(userName);
		user.setUserEmail(userEmail);
		user.setUserPassword(userpassword);
		user.setAge(age);
		return user;
	}

}