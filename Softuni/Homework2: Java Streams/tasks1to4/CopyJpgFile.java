package tasks1to4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//Problem 4. Copy .jpg File
//Write a program that copies the contents of a .jpg file to another 
//using FileInputStream, FileOutputStream, and byte[] buffer. 
//Set the name of the new file as my-copied-picture.jpg.

public class CopyJpgFile {

	public static void main(String[] args) {
		String picture="cat.jpg";
		copyPicture(picture);
	}

	public static void copyPicture(String picture){
		try(FileInputStream from=new FileInputStream(picture)){
			FileOutputStream to=new FileOutputStream("my-copied-picture.jpg");
			
			byte[] buffer = new byte[4096];
			int bytes_read; // How many bytes in buffer
			
			while((bytes_read = from.read(buffer)) != -1){
				to.write(buffer, 0, bytes_read);
			}
			to.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
