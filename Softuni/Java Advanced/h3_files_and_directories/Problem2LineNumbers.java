package h3_files_and_directories;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problem2LineNumbers {

    public static void main(String[] args) throws IOException {
        File inputFile = new File("/home/partsaleva/Desktop/SoftUni homeworks/"
                + "03. Java-Advanced-Files-and-Directories-Exercises/03_LineNumbers/02_LinesIn.txt");
        File outputFile = new File("/home/partsaleva/Desktop/SoftUni homeworks/"
                + "03. Java-Advanced-Files-and-Directories-Exercises/03_LineNumbers/02_LinesOut.txt");
        int n = 1;
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(inputFile));
            writer = new BufferedWriter(new FileWriter(outputFile));
            String line=null;
            while ((line=reader.readLine()) !=null) {
                writer.write(n + ". ");
                writer.write(line);
                writer.write(System.getProperty("line.separator"));
                n++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        reader.close();
        writer.close();
    }

}
