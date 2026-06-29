package in.sp.rec;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\LENOVO\\OneDrive\\Desktop\\bcs\\student.txt");
		
		try {
			file.createNewFile();
			System.out.println("File create succefully");
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
