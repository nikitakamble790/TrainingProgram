package file_handlin;

import java.io.File;

public class Get_File_Information {

	public static void main(String[] args) {
		File file1=new File("D:\\WebCreationPractice\\firstfile.txt");
		if(file1.exists())
		{
			System.out.println("The name of the file is: " + file1.getName());
			System.out.println("The absolute path of the file is: " + file1.getAbsolutePath()); 
			 System.out.println("Is file writeable?: " + file1.canWrite());  
			 System.out.println("Is file readable: " + file1.canRead()); 
			 System.out.println("The size of the file in bytes is: " + file1.length());  
		System.out.println(file1.isFile());
		}
		else {
			System.out.println("The file does not exist");
		}
			
	}

}
