package h3_files_and_directories;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Problem7ReadFromSpecifiedLine {

    public static void main(String[] args) {
        File file= new File("/home/partsaleva/Desktop/SoftUni homeworks/"
                + "03. Java-Advanced-Files-and-Directories-Exercises/File2.txt");
        int lineNumber=10;int count=0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while((line=reader.readLine())!= null){
                count++;
                if (count>=lineNumber) 
                    System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
