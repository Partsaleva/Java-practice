package h3_files_and_directories;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Problem3WordsCount {

    public static void main(String[] args) throws IOException {
        File inputFile = new File("/home/partsaleva/Desktop/SoftUni homeworks/"
                + "03. Java-Advanced-Files-and-Directories-Exercises/04_WordCount/text1.txt");
        File words=new File("/home/partsaleva/Desktop/SoftUni homeworks/"
                + "03. Java-Advanced-Files-and-Directories-Exercises/04_WordCount/words1.txt");
        BufferedReader reader=null;
        try {
            Map<String, Integer> map=wordsMap(words);
            reader=new BufferedReader(new FileReader(inputFile));
            String line=null;
            while((line=reader.readLine())!= null){
                String[] wordsInText=line.split("\\W+");
                for (String str: wordsInText) {
                    String word=str.toLowerCase();
                    if (map.containsKey(word)) {
                        int count=map.get(word);
                        map.put(word, count+1);
                    }
                }
            }
            map=sortMapByValue(map);
            writeMapInFile(map);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            reader.close();
        }
        
    }

    private static Map<String, Integer> sortMapByValue(Map<String, Integer> map) {
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey, 
                        Map.Entry::getValue, 
                        (e1, e2) -> e1, 
                        LinkedHashMap::new));
    }

    private static void writeMapInFile(Map<String, Integer> map) throws IOException{
        File outputFile = new File("/home/partsaleva/Desktop/SoftUni homeworks/"
                + "03. Java-Advanced-Files-and-Directories-Exercises/04_WordCount/wordCount1Output.txt");
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(outputFile))){
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                writer.write(entry.getKey());
                writer.write(" - ");
                writer.write(String.valueOf(entry.getValue()));
                writer.write(System.getProperty("line.separator"));
            }
        }       
    }

    private static Map<String, Integer> wordsMap(File words) throws FileNotFoundException, IOException {
        Map<String, Integer> map=new TreeMap<>();
        try(BufferedReader reader=new BufferedReader(new FileReader(words))){
            String[] wordsInFile=reader.readLine().split("\\s+");
            for (String str : wordsInFile) {
                map.put(str.toLowerCase(), 0);
            }
        }
        return map;    
    }
}
