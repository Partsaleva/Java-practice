package homework2JavaStreams.tasks5to8.csvDatabase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FileRead {

	public List<Student> readStudentsFile(){
		List<Student> students=new ArrayList<>();
		try(BufferedReader reader=new BufferedReader(
				new FileReader("students.txt"))){
			String line=null;
			while((line=reader.readLine())!=null){
				String[] words=line.split(",");
				Student s=new Student(Integer.parseInt(words[0]), words[1], 
						words[2], Integer.parseInt(words[3]), words[4]);
				students.add(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return students;
		
	}
	
	
	public List<Grades> readGradesFile(){
		List<Grades> grades=new ArrayList<>();
		try(BufferedReader reader=new BufferedReader(
				new FileReader("grades.txt"))){
			String line=null;
			while((line=reader.readLine())!=null){
				String[] words=line.split(",");
				Grades g=new Grades(Integer.parseInt(words[0]), words[1], words[2]);
				grades.add(g);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return grades;
		
	}

	public TreeMap<Integer, String> studentsFileInTreeMap(){
		TreeMap<Integer, String> studentsMap=new TreeMap<>();
		try(BufferedReader reader=new BufferedReader(
				new FileReader("students.txt"))){
			String line=null;
			while((line=reader.readLine())!=null){
				String[] words=line.split(",");
				
				studentsMap.put(Integer.parseInt(words[0]), line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return studentsMap;
	}
	
	public TreeMap<Integer,String> gradesFileInTreeMap(){
		TreeMap<Integer, String> gradesMap=new TreeMap<>();
		try(BufferedReader reader=new BufferedReader(
				new FileReader("grades.txt"))){
			String line=null;
			while((line=reader.readLine())!=null){
				String[] words=line.split(",");
				
				gradesMap.put(Integer.parseInt(words[0]), line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return gradesMap;
	}
	
	public void saveDataInFile(Map<Integer, String> map, String fileName) {
		try (BufferedWriter out = new BufferedWriter(new FileWriter(fileName))) {
			for (Map.Entry<Integer, String> entry : map.entrySet()) {
				out.write(entry.getValue());
				out.write(System.getProperty("line.separator"));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
}
