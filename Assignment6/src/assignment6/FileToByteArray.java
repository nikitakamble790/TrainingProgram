package assignment6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

public class FileToByteArray {

	public static void main(String[] args) {
		String current;
		try {
			Scanner sc = new Scanner(new File("D:\\htmlbasic\\new.txt"));
			while(sc.hasNext()) {
				current=sc.next();
				byte[] arr = null;
				try {
					arr = current.getBytes("UTF-16");
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 System.out.println(Arrays.toString(arr));

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
