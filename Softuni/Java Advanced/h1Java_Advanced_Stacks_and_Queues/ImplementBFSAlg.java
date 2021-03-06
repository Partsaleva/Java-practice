package h1Java_Advanced_Stacks_and_Queues;

import java.io.File;
import java.util.LinkedList;

public class ImplementBFSAlg {

    public static void main(String[] args) {
        try {
            traverseDirectory("/home/partsaleva/Documents");
        } catch (Exception e) {
            System.err.println("Access denied");
        }
    }
    
    public static void traverseDirectory(String path) {
        LinkedList<File> subFolders=new LinkedList<>();
        File root=new File(path);
        subFolders.add(root);
        while (subFolders.size()!=0) {
            File curentFolder=subFolders.removeFirst();
            for (File file : curentFolder.listFiles()) {
                if (file.isDirectory()) {
                    subFolders.add(file);
                }
            }
            System.out.println(curentFolder.toString());
        }
    }
}
