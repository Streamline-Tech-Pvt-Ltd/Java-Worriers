package in.sp.rec;

import java.io.File;
import java.io.IOException;

public class MUltipleFIleCreate {

	public static void main(String[] args) {

for(int i=0;i<10;i++) {
	File file = new File("C:\\Users\\LENOVO\\OneDrive\\Desktop\\bcs//student'"+i+"'.txt");
		try {
			file.createNewFile();
			System.out.println("File created succefully");
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}

	}


}
}