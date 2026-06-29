package in.sp.rec;

import java.io.FileWriter;
import java.io.IOException;

public class AddMultipleData {

	public static void main(String[] args) {
		try(FileWriter file = new FileWriter("C:\\Users\\LENOVO\\OneDrive\\Desktop\\bcs\\student.txt",true))
		{
			
			file.write("\n hey guys can you read data ");
			file.flush();
			System.out.println("Data Added succefully");
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
