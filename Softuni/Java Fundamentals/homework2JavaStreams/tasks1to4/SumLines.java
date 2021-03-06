package homework2JavaStreams.tasks1to4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Problem 1. Sum lines
//Write a program that reads a text file and prints on the console 
//the sum of the ASCII symbols of each of its lines. 
//Use BufferedReader in combination with FileReader.

public class SumLines {

	public static void main(String[] args) {
		String file="lines.txt";
		createFile(file);
		readFileAndSum(file);
	}

	public static void readFileAndSum(String file){
		try(BufferedReader br=new BufferedReader(new FileReader(file))){
			String line;
			while((line=br.readLine())!=null){
				System.out.println(sumLine(line));
			}
		} catch (FileNotFoundException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	private static int sumLine(String str){
		int sum=0;
		for (int i = 0; i < str.length(); i++) {
			sum+=str.charAt(i);
		}
		return sum;		
	}
	
	//it was easier to create it here
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
