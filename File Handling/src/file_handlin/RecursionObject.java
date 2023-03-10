package file_handlin;

import java.io.File;
import java.nio.file.Files;
//import org.springframework.util.FileCopyUtils;

public class RecursionObject {

	public static void main(String[] args) {
		/*String maindirpath = "D:\\Github\\TrainingProgram\\Assignment1";
		
		//String destination = "D:\\NewPath";

		// File object
		File maindir = new File(maindirpath);
		//File destdir = new File(destination);

		if (maindir.exists() && maindir.isDirectory()) {

			// array for files and sub-directories
			// of directory pointed by maindir
			File arr[] = maindir.listFiles();

			
			System.out.println("Files from main directory : " + maindir);
			System.out.println("**********************************************");

			// Calling recursive method
			RecursivePrint(arr, 0, 0);
		}

	}

	static void RecursivePrint(File[] arr, int index, int level) {
		String destination = "D:\\NewPath";
		File destdir = new File(destination);
		
		// terminate condition
		if (index == arr.length)
			return;

		// tabs for internal levels
		for (int i = 0; i < level; i++) {
			System.out.print("\t");

		// for files
		if (arr[index].isFile()) {
			System.out.println(arr[index].getName());
			//InputStream in = new FileInputStream(sourceLocation);
            //OutputStream out = new FileOutputStream(targetLocation);

            // Copy the bits from instream to outstream
           // byte[] buf = new byte[1024];
            //int len;
            //while ((len = in.read(buf)) > 0) {
                //out.write(buf, 0, len);
            }
           // in.close();
           // out.close();
			
			
			//FileUtils.copyFileToDirectory(srcFile, dstDir);
		    //Files.copy(arr[index],destdir);
		}
		
		

		// for sub-directories
		//else if (arr[index].isDirectory()) {
			//System.out.println("[" + arr[index].getName() + "]");

			// recursion for sub-directories
			RecursivePrint(arr[index].listFiles(), 0, level + 1);
		}
		//}

		// recursion for main directory
		//RecursivePrint(arr, ++index, level);
	}
*/
	}
}
