package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.User;

public class UserDao {
	
	String DRIVER = "com.mysql.cj.jdbc.Driver";
    String URL = "jdbc:mysql://localhost:3306/mytest";
    String USER = "root";
    String PASSWORD = "";
    
    public void registerUser(User user)throws SQLException, ClassNotFoundException{
    	
    	Class.forName(DRIVER);
    	
    	try {
    		Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
    		
    		PreparedStatement statement = connection.prepareStatement("insert into users values(?,?,?,?,?)");
			
    		statement.setString(1, user.getFname());
    		statement.setString(2, user.getLname());
    		statement.setString(3, user.getUsername());
    		statement.setString(1, user.getPassword());
    		statement.setInt(1, user.getAge());
    		
    		statement.executeUpdate();
    		statement.close();
    		connection.close();
    		
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

}
