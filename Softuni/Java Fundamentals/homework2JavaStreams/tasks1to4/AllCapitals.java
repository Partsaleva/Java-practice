package homework2JavaStreams.tasks1to4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

//Problem 2. ALL CAPITALS!
//Write a program that reads a text file and changes the casing 
//of all letters to upper. The file should be overwritten. Use BufferedReader,
//FileReader, FileWriter, and PrintWriter.
public class AllCapitals {

	public static void main(String[] args) {
		String file="lines1.txt";
		createFile(file);
		readFile(file);

	}

	
	public static void readFile(String file){
		List<String> lineArray = new ArrayList<>();	
		
		try(BufferedReader br= new BufferedReader(new FileReader(file))){
			String line=null;
			while((line=br.readLine())!=null){
				lineArray.add(line.toUpperCase());
			}
			
			changeToCapitals(file, lineArray);
			
		} catch (FileNotFoundException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	public static void changeToCapitals(String file, List<String> lines){
		try(BufferedWriter br=new BufferedWriter(new FileWriter(file))){
			
			PrintWriter printWriter = new PrintWriter(br);
			
			for (String str : lines) {
				printWriter.println(str);
			}
			printWriter.close();
			
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	public static void createFile(String file){
		try(BufferedWriter br=new BufferedWriter(new FileWriter(file))){
			br.write("Kvo staa?" + "\n");
			br.write("Nishto, ti?" + "\n");
			br.write("Chuk, maina." + "\n");
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
