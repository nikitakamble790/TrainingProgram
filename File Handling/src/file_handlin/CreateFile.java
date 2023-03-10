package file_handlin;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		try {
		File file1=new File("D:\\WebCreationPractice\\firstfile.txt");
		if(file1.createNewFile())
		{
			System.out.println("File "+file1.getName()+" is created successfully");
		}
		else {
			System.out.println("file is already exist");
		}
		}catch(IOException e) {
			System.out.println("An unexpected error is occurred.");  
            e.printStackTrace();  
		}

	}
	
	
}
