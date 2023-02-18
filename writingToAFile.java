package fileHandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class writingToAFile {
	/*
	 * public static void main(String[] args) {
	 * 
	 * File s = new
	 * File("C:\\Users\\Eamon\\Downloads\\Hitch (2005) [1080p]/Hitch.txt");
	 * 
	 * try { if(s.createNewFile()) { System.out.println(s
	 * +" is Created Successfully");
	 * 
	 * } else if (s.exists()) { System.out.println("File Exists"); } } catch
	 * (IOException e) {
	 * 
	 * e.printStackTrace(); }
	 * 
	 * }
	 */
	
	public static void main(String[] args)
	        throws IOException
	    {
	        // Assigning the content of the file
	        String text
	            = "Welcome to geekforgeeks\nHappy Learning!";
	 
			/*
			 * // Defining the file name of the file Path fileName = Path.of(
			 * "Users/Eamon/Downloads/Hitch (2005) [1080p]/Hitch.txt");
			 * 
			 * // Writing into the file Files.writeString(fileName, text);
			 * 
			 * // Reading the content of the file String file_content =
			 * Files.readString(fileName);
			 * 
			 * // Printing the content inside the file System.out.println(file_content);
			 */
	    }
}
