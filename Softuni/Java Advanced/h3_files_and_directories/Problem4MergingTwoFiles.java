package h3_files_and_directories;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problem4MergingTwoFiles {

    public static void main(String[] args) {
        File first = new File("/home/partsaleva/Desktop/SoftUni homeworks/"
                + "03. Java-Advanced-Files-and-Directories-Exercises/05_MergingFiles/01_FileOne.txt");
        File second = new File("/home/partsaleva/Desktop/SoftUni homeworks/"
                + "03. Java-Advanced-Files-and-Directories-Exercises/05_MergingFiles/01_FileTwo.txt");
        File merged = new File("/home/partsaleva/Desktop/SoftUni homeworks/"
                + "03. Java-Advanced-Files-and-Directories-Exercises/05_MergingFiles/merged1.txt");

        try (BufferedReader read1 = new BufferedReader(new FileReader(first));
                BufferedReader read2 = new BufferedReader(new FileReader(second));
                BufferedWriter writer = new BufferedWriter(new FileWriter(merged))) {
            String line1 = null;
            String line2 = null;
            while ((line1 = read1.readLine()) != null && (line2 = read2.readLine()) != null) {
                writer.write(line1);
                writer.write(System.getProperty("line.separator"));
                writer.write(line2);
                writer.write(System.getProperty("line.separator"));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
