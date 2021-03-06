package h3_files_and_directories;

import java.io.File;
import java.util.LinkedList;
import java.util.List;


public class Problem5GetFolderSize {

    public static void main(String[] args) {
        File file=new File("/home/partsaleva/Desktop/SoftUni homeworks/"
                + "03. Java-Advanced-Files-and-Directories-Exercises/TestFolder");
        List<File> subFiles=new LinkedList<>();
        double size=0;
        subFiles.add(file);
        while (!subFiles.isEmpty()) {
            File dirToTraverse=subFiles.remove(0);
            for (File f : dirToTraverse.listFiles()) {
                if (f.isDirectory()) {
                    subFiles.add(f);
                } else {
                    size+=f.length();;
                }
            }
        }
        System.out.println(size/(1024*1024));
    }

}
