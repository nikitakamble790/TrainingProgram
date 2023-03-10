package file_handlin;

import java.io.*;

public class CopyExtensionFiles {

	public static void main(String[] args) {
		File file=new File("D:\\WebCreationPractice");																							
		File[] f1=file.listFiles((d,f)->f.toLowerCase().endsWith(".txt"));
		for(File f:f1)
		{
			System.out.println(f.getName());
		}
	}

}
