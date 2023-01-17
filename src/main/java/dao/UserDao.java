package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;

public class UserDao {
	
	static String DRIVER = "com.mysql.cj.jdbc.Driver";
    static String URL = "jdbc:mysql://localhost:3306/mytest";
    static String USER = "root";
    static String PASSWORD = "";
    
    public void registerUser(User user)throws SQLException, ClassNotFoundException{    	
    	Class.forName(DRIVER);
    	
    	try {
    		Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
    		
    		PreparedStatement statement = connection.prepareStatement("insert into users values(?,?,?,?,?,?)");
    		
			statement.setString(1, null);
    		statement.setString(2, user.getFname());
    		statement.setString(3, user.getLname());
    		statement.setString(4, user.getUsername());
    		statement.setString(5, user.getPassword());
    		statement.setInt(6, user.getAge());
    		
    		statement.executeUpdate();
    		statement.close();
    		connection.close();    		
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public static boolean validate(String username, String pass )throws SQLException, ClassNotFoundException {
    	
    	
    	boolean st = false;
    	
    	try {
    		Class.forName(DRIVER);
    		Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
    		PreparedStatement statement = connection.prepareStatement("select * where username = ? and password = ?");
    		statement.setString(1, username);
    		statement.setString(2, pass);
    		
    		ResultSet rs = statement.executeQuery();
    		st = rs.next();
    		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return st;
    }

}
