package in.sp.main;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fileread {

	public static void main(String[] args) {
		FileReader file=null;
		try
		{
			 file= new FileReader("C:\\Users\\LENOVO\\OneDrive\\Desktop\\bcs\\student.txt");
			int i=file.read();
			System.out.println(i);
			
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}finally {
			try
			{
			//InputStreamReader file = null;
			file.close();	
			}catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

}
