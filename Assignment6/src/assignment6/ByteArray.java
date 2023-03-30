package assignment6;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteArray {

	public static void main(String[] args) {
		String str="Nikita";
		byte[] arr = null;
		try {
			arr = str.getBytes("UTF-16");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(arr);
		 System.out.println(Arrays.toString(arr));
	}

}
