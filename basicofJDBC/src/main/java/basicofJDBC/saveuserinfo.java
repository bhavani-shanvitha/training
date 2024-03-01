package basicofJDBC;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

//jdbc steps
public class saveuserinfo {
	public static void main(String[] args) {
		//step1->>load the driver
		//(interface)driver->java.sql;
		//MYSQL server driver class name->com.mysql.cj.jdbc.Driver
		
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step2->get connection 
			//DBURL->consists of protocol:SubProtocol:SubName
			//protocol->JDBC
			//SubProtocol->mysql
			//SubName->hostname(address where particular database exsist):port number/databasename?user_name=&password
			String dburl="jdbc:mysql://localhost:3306/userinfo?user=root&password=admin";
		    connection=DriverManager.getConnection(dburl);
			System.out.println(connection);
			
			//step3->create stmt
			String sqlQuery="insert into user(user_id,user_name,user_email,user_password,user_age)values(106,'shans','shans16@gmail.com','shans@123',22)";
			preparedStatement=connection.prepareStatement(sqlQuery);
			
			//step4->execute the query process the result
			int result=preparedStatement.executeUpdate();//insert,update or delete
			System.out.println(result+"row effected");
			
//			//step5->close connection
//			connection.close();
//			preparedStatement.close();
		}
		catch (ClassNotFoundException |SQLException e) {
			System.out.println(e.getMessage());
		}
		
		//step5->close connection
		finally {
			if(connection!=null) {
				try {
					connection.close();
				}
				catch(SQLException e) {
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
		
	
	}
}
