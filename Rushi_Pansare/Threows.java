package com.main.Exception;

import java.io.FileReader;
import java.io.IOException;

public class Threows {
	static void readFile() throws IOException{
			FileReader fr= new FileReader("abc.txt");
	}

	public static void main(String[] args) {
		
		try {
			readFile();
			
		} catch (IOException e) {
			
			System.out.println("exception has ben handal");
		}

	}

}
