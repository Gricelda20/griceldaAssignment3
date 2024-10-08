package com.coderscampus.assignment3;

import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {
		UserService userService = new UserService();
		UserService.getUsers("src/data.txt");
		Scanner scanner = new Scanner(System.in);
		String username;
		String password;
		final int MAX_ATTEMPTS = 5;
		
		for (int loginAttempts = 0; loginAttempts < MAX_ATTEMPTS ; loginAttempts++) {
			System.out.println("Enter you email:");
			username =  scanner.nextLine();
			System.out.println("Enter your password:");
			password = scanner.nextLine();
			
			User validUser = UserService.validateUser(username, password);
			if (validUser != null) {
			System.out.println("Welcome "+ validUser.getName());
			break;
			} else if (loginAttempts == MAX_ATTEMPTS  - 1 ) {
				System.out.println("Too may failed login attempts, you are now locked out.");
			} else {
				System.out.println("Invalid login, please try again.");
			}
		}
	}	
}

