package h3_files_and_directories;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Problem6Timer {

    public static void main(String[] args) {
        File first = new File("/home/partsaleva/Desktop/SoftUni homeworks/"
                + "03. Java-Advanced-Files-and-Directories-Exercises/File1.csv");
        File second = new File("/home/partsaleva/Desktop/SoftUni homeworks/"
                + "03. Java-Advanced-Files-and-Directories-Exercises/File2.txt");
        
        try (BufferedReader reader1 = new BufferedReader(new FileReader(first));
            BufferedReader reader2 = new BufferedReader(new FileReader(second))){
            String line;
            long start1=System.nanoTime();
            while((line=reader1.readLine())!= null){}
            long end1=System.nanoTime()-start1;
            String line2;
            long start2=System.nanoTime();
            while((line2=reader1.readLine())!= null){}
            long end2=System.nanoTime()-start2;
            if (end1>end2) {
                System.out.println("true");
            }else System.out.println("false");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
