package com.coderscampus.assignment3;

public class UserService {
	 private static User[] userArray;
	 
	 public static void getUsers(String filename) {
		 FileService fileService = new FileService();
		 userArray = fileService.readFile(filename);	
	 	}
	 
	 public static User validateUser(String username, String password) {
		 for (User user : userArray) {
			 if (user.getUserName().equalsIgnoreCase(username)
					 && user.getPassword().equals(password)) {
				 return user;
			 }
		 }
		 return null;
	 }
 }
	 
	 
 
 

