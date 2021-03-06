package h3_files_and_directories;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problem1OddLines {

    public static void main(String[] args) throws IOException {
        File inputFile=new File("/home/partsaleva/Desktop/SoftUni homeworks/03. Java-Advanced-Files-and-Directories-Exercises/02_OddLines/01_OddLinesIn.txt");
        File outputFile=new File("/home/partsaleva/Desktop/SoftUni homeworks/03. Java-Advanced-Files-and-Directories-Exercises/02_OddLines/01OddLinesOut.txt");
        int n=0;  
        BufferedReader br=null;
        BufferedWriter writer=null;
        try{
            br=new BufferedReader(new FileReader(inputFile));
            writer=new BufferedWriter(new FileWriter(outputFile));
            String line=null;
            while ((line = br.readLine()) != null) {
                if (n%2==1) {
                    writer.write(line);
                    writer.write(System.getProperty("line.separator"));
                }
                n++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        br.close();
        writer.close();
    }
}
