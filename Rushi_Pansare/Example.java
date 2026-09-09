package com.main.Exception;
import java.io.*;

public class Example {
	
	public static void main(String[] args) {
		String s = null;
		//System.out.println(s.length());				thread exception  runtime exception
		try {
			System.out.println(s.length());					//risky code is written in it
		}
		catch (Exception e) {								//jo exception ynare ahe tycha type mahit asla taer traku shakto apan
				System.out.println(e);
		}
		
		
	}

}

