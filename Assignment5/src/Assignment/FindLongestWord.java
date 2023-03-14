package Assignment;

import java.io.*;
import java.util.Scanner;

public class FindLongestWord {

	public static void main(String[] args) throws FileNotFoundException {
		FindLongestWord f1=new FindLongestWord();
		f1.findLongestWords();

	}
	public String findLongestWords() throws FileNotFoundException {

	       String longest_word = "";
	       String current;
	       Scanner sc = new Scanner(new File("D:\\htmlbasic\\new.txt"));


	       while (sc.hasNext()) {
	          current = sc.next();
	           if (current.length() > longest_word.length()) {
	             longest_word = current;
	           }

	       }
	         System.out.println("\n"+longest_word+"\n");
	            return longest_word;
	            }

}
