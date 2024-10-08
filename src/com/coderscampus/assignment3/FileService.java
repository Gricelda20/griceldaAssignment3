package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileService {
	public User[] readFile(String filename) {
		try {
			FileReader fileReader = new FileReader(filename);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			User[] userArray = new User[4];
			int lineCount = 0;
			
			while ((line = bufferedReader.readLine()) != null) {
				String[] userData = line.split(",");
				User user = new User(userData[0], userData[1], userData[2]);
				userArray[lineCount] = user;
				lineCount++;
				
			}
			bufferedReader.close();
			return userArray;
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e ) {
			e.printStackTrace();
		}
			return null;	
	}

	public User User(String username, String password) {

		return null;
	}
}