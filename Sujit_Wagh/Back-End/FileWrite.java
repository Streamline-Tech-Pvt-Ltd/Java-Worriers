public package in.sp.rec;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("C:\\Users\\LENOVO\\OneDrive\\Desktop\\bcs\\student.txt");
			file.write("I am  to java");
			file.flush();
			System.out.println("Data added succefully");

		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
             
		
		
	}

}
 {
    
}
