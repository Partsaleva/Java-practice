package homework2JavaStreams.tasks5to8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Problem 5. Save an ArrayList of doubles
//Write a program that saves and loads the information 
//from an ArrayList to a file using ObjectInputStream, 
//ObjectOutputStream. Set the name of the new file as doubles.list
public class ArrayListOfDoubles {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		for (int i = 1; i < 11; i++) {
			list.add(i);
		}
		
		saveArrayListToFile(list);
		loadArrayList();
	}

	public static void saveArrayListToFile(ArrayList<Integer> list){
		try(ObjectOutputStream objStream=new ObjectOutputStream(
						new BufferedOutputStream(
						new FileOutputStream("doubles.list")))){
			
			objStream.writeObject(list);
			System.out.println("Object is saved");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void loadArrayList(){
		try(ObjectInputStream objStream=new ObjectInputStream(
						new BufferedInputStream(
						new FileInputStream("doubles.list")))){
			System.out.println("Object " + objStream.readObject());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
