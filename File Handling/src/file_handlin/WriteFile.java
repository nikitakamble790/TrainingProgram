package file_handlin;

import java.io.*;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		File sourceFile = new File("C:\\Users\\Demo\\Downloads\\employee\\");
		File destinationFile = new File("\\images\\" + sourceFile.getName());

		FileInputStream fileInputStream = new FileInputStream(sourceFile);
		FileOutputStream fileOutputStream = new FileOutputStream(
		                destinationFile);

		int bufferSize;
		byte[] bufffer = new byte[512];
		while ((bufferSize = fileInputStream.read(bufffer)) > 0) {
		    fileOutputStream.write(bufffer, 0, bufferSize);


		}

}
}
