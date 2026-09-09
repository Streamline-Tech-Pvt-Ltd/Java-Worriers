package in.sp.main;

import java.io.FileReader;
import java.io.IOException;

public class FileCharAccess {

	public static void main(String[] args) {
		
	try {
		
	FileReader	file = new FileReader("C:\\Users\\LENOVO\\OneDrive\\Desktop\\bcs\\student.txt");
		int i=file.read();
		System.out.println(i);
		System.out.println((char) i);
		
	}catch(IOException e)
	{
		System.out.println(e.getMessage());
	
	}

	}

}
