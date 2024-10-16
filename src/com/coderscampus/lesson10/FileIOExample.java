package com.coderscampus.lesson10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOExample {

	public static void main(String[] args) throws IOException {
		
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			
//			Below will be the cleanest way to read a line.
			
			String line;
			while ((line = fileReader.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Oops, there was an exception");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Oops, there was an I/O Exception");
			e.printStackTrace();
		} finally {
			try {
			System.out.println("Closing file reader");
				fileReader.close();
		} catch (IOException e ) {
			e.printStackTrace();
		}
	
		}
	}
}
	
