package tasks5to8.task6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//Problem 6. *Save a Custom Object in a file
//Write a program that saves and loads the information 
//from a custom Object that you have created to a file 
//using ObjectInputStream, ObjectOutputStream. Create a class 
//Course that has a String field containing the name and an 
//integer field containing the number of students attending the course. 
//Set the name of the new file as course.save.
public class CustomObjectInAFile {

	public static void main(String[] args) {
		saveObjectToFile();
		loadObjectFromFile();

	}

	public static void saveObjectToFile(){
		Course course=new Course("math", 3);
		try(ObjectOutputStream stream=new ObjectOutputStream(
						new BufferedOutputStream(
						new FileOutputStream("course.save")))){
			
			stream.writeObject(course);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void loadObjectFromFile(){
		try(ObjectInputStream in=new ObjectInputStream(
							new BufferedInputStream(
							new FileInputStream("course.save")))){
			System.out.println(in.readObject());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
