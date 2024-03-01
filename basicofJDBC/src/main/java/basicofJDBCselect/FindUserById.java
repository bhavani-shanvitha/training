package basicofJDBCselect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FindUserById {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("enter the id:");
		int userId=read.nextInt();
		
		findUserById(userId);
	}
	public static void findUserById (int id) {
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dbUrl = "jdbc:mysql://localhost:3306/userinfo?user=root&password=admin";
		connection = DriverManager.getConnection(dbUrl);
		String sqlQuery="select * from user where user_id=?";
		preparedStatement = connection.prepareStatement(sqlQuery);
		
		preparedStatement.setInt(1,id);
		
		
	    resultSet= preparedStatement.executeQuery();
	    
	    //process the result display to user
	    if(resultSet.next()){//next return true if data is present else false
	    	int userId= resultSet.getInt("user_id");
	    	System.out.print("UserId= "+userId+"\t");
	   
	    	String userName=resultSet.getString("user_name");
	    	System.out.print("UserName= "+userName+"\t");
	    	
	    	String userEmail=resultSet.getString("user_email");
	    	System.out.print("UserEmail= "+userEmail+"\t");
	    	
	    	String userPassword=resultSet.getString("user_password");
	    	System.out.print("UserPassword= "+userPassword+"\t");
	    	
	    	int userAge=resultSet.getInt("user_age");
	    	System.out.print("UserAge= "+userAge+"\t");
	    	System.out.println();
	    }else {
	    	System.out.println("user with the given " + id+ " not found");
	    }
	} 
	catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	finally {
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
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}

}


