package basicofJDBCupdate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import basicofJDBC.User;
public class updateuserinfo {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		User user = updateuserinfo(read);
		int numberOfRows = modifyUserInfo(user);
		if (numberOfRows == 1) {
			
			System.out.println("User info modified");
		} else {
			
			System.out.println("User info not modified");
		}
	}
	public static int modifyUserInfo(User user) {
		int numberOfRows=0;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/userinfo?user=root&password=admin";
			connection = DriverManager.getConnection(dbUrl);
			String sqlQuery = "update user set user_password=? where user_id=?";
			preparedStatement = connection.prepareStatement(sqlQuery);

			preparedStatement.setInt(2, user.getUserId());
			preparedStatement.setString(1, user.getUserPassword());
			numberOfRows = preparedStatement.executeUpdate();
		}
		 catch (ClassNotFoundException | SQLException e) {
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
	public static User updateuserinfo(Scanner read) {
		User user = new User();
		System.out.println("Enter the User Id : ");
		int id = read.nextInt();
		
		System.out.println("Enter the User Password : ");
		String userpassword = read.next();
		
		user.setUserId(id);
		
		user.setUserPassword(userpassword);

		return user;
	}
		
	}
