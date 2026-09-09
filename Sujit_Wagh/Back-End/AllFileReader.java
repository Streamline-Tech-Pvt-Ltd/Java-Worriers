package in.sp.main;

import java.io.FileReader;
import java.io.IOException;

public class AllFileReader {

	public static void main(String[] args) {
		try
		{
			FileReader file = new FileReader("C:\\Users\\LENOVO\\OneDrive\\Desktop\\bcs\\student.txt");
			int i;
			while((i=file.read())!=-1)
			{
				System.out.print((char) i);
				
			}
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
