package com.coderscampus.assignment3;

public class User {
	private String username;
	private String password;
	private String name;
	
	
	public User(String username, String password, String name) {

	this.username = username;
	this.password = password;
	this.name = name;
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", name=" + name 	+"]";	
				
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.name = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	
	}
}

	