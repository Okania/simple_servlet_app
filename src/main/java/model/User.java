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
	
	
	public void setFname(String fname) {
		this.fname = fname;
	}	
	public String getFname() {
		return fname;
	}
	
	
	public void setLname(String lname) {
		this.fname = lname;
	}
	
	public String getLname() {
		return lname;
	}
	
	
	public void setUsername(String fname) {
		this.fname = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	
	public void setPassword(String password) {
		this.fname = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	
	public void setAge(String age) {
		this.fname = age;
	}
	
	public int getAge() {
		return age;
	}

}
