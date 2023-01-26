package model;

import java.io.Serializable;
//import java.io.ObjectInputStream.GetField;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String fname;
	private String lname;
	private String username;
	private String password;
	private int age;
	
	public User(String fname, String lname,String username,String password, int age) {
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.password = password;
		this.age = age;
	}
		
	public String getFname() {
		return fname;
	}	
	
	public String getLname() {
		return lname;
	}

	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getAge() {
		return age;
	}

}
