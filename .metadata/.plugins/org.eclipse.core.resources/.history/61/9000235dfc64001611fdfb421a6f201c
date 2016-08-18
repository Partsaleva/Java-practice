package tasks1to4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//Problem 3. Count character types.
//Write a program that reads a list of words from the file words.txt and
//finds the count of vowels (гласни букви), consonants (съгласни) and
//other punctuation marks. Since English is a bit tricky,
//assume that a, e, i, o, u are vowels and all others are consonants. 
//Punctuation marks are (!,.?). Do not count whitespace.
public class CountCharacterTypes {

	public static void main(String[] args) {
		createFile();
		readAndCount();

	}

	public static void readAndCount(){
		try(BufferedReader reader=new BufferedReader(new FileReader("words.txt"))){
			int vowels=0;
			int consonants=0;
			int punctuation=0;
			String line=null;
			String vRegex = "[ aeiou!,.?0-9]";  
			String cRegex = "[^aeiou]"; 
			String pRegex = "[^!,.?]"; 	    
			
			while((line=reader.readLine())!=null){
				for (int i = 0; i < line.length(); i++) {
					//remove all that are not vowels and count
					vowels=line.replaceAll(cRegex, "").length();
					//remove all but consonants and count
					consonants=line.replaceAll(vRegex, "").length();
					//remove all but punct and count
					punctuation=line.replaceAll(pRegex, "").length();
				}
			}
			
			writeInFile(vowels,consonants,punctuation);
			
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void writeInFile(int vowels,int consonants,int punctuation){
		try(BufferedWriter br=new BufferedWriter(new FileWriter("count-chars.txt"))){
			PrintWriter printWriter = new PrintWriter(br);
			printWriter.println("Vowels: "+vowels);		
			printWriter.println("Consonants: "+consonants);
			printWriter.println("Punctuation: "+punctuation);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	public static void createFile(){
		try(BufferedWriter br=new BufferedWriter(new FileWriter("words.txt"))){
			br.write("Thanks to us, you owe it to the Chinese.");
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
