package in.sp.rec;

import java.io.File;
import java.io.IOException;

public class DuplicateFile {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\LENOVO\\OneDrive\\Desktop\\bcs\\student.txt");
		try {
			if(file.createNewFile())
			{
				System.out.println("File Create sucefullay");
			}else
			{
				System.out.println("File arleday Exit");
			}
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
