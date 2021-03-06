package homework2JavaStreams.tasks5to8.csvDatabase;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
//not so good solutions
public class CSVDatabase {

	public static void main(String[] args) {
		CSVDatabase db=new CSVDatabase();
		db.searchByFullname("Mariana Ivanova");
		db.searchById(6);
		db.searchById(17);
		db.deleteById(5);
		db.insertStudent("Georgi Mamarchev 19 Sofia");
		db.insertGradesById(6);
	}

	List<Student> students=new ArrayList<>();
	List<Grades> grades= new ArrayList<>();
	
	public CSVDatabase() {	
		FileRead f=new FileRead();
		this.students = f.readStudentsFile();
		this.grades = f.readGradesFile();
	}
	
	public void searchByFullname(String fullName){
		String[] names=fullName.split(" ");
		for (Student s : students) {
			if(s.getFirstName().equals(names[0]) && 
					s.getLastName().equals(names[1])){
				searchById(s.getId());
			}
		}
		
	}
	public boolean idIsFound(int id){
		for (Student s : students) {
			return s.getId()==id;
		}
		return false;
	}
	
	public void searchById(int id){
		for (Student s : students) {
			if(s.getId()==id){
				System.out.println(s);
			}
		}
		for (Grades g : grades) {
			if(g.getId()==id){
				System.out.format("# %s\n# %s\n", g.getMathGrades(), g.getLiterGrades());
			}
		}
		if (!idIsFound(id)) {
			System.out.println("Student does not exist");
		}
	}
	
	public void deleteById(int id){
		FileRead f=new FileRead();
		Map<Integer,String> s=f.studentsFileInTreeMap();
		Map<Integer, String> g=f.gradesFileInTreeMap();
		s.remove(id);
		g.remove(id);
		f.saveDataInFile(s, "students.txt");
		f.saveDataInFile(g, "grades.txt");
		if(!idIsFound(id)){
			System.out.println("Student does not exist");
		}
	}
	
	public void insertStudent(String studentData){
		FileRead f=new FileRead();
		TreeMap<Integer,String> students= f.studentsFileInTreeMap();
		int id=students.lastKey()+1;
		studentData=studentData.replace(' ', ',');
		students.put(id, id+","+studentData);
		f.saveDataInFile(students, "students.txt");
			
	}
	
	public void insertGradesById(int id){
		FileRead f=new FileRead();
		List<Grades> grades=f.readGradesFile();
		Grades neededGrades=null;
		for (Grades g : grades) {
			if(g.getId()==id){
				neededGrades=g;
			}
		}
		String math=neededGrades.getMathGrades();
		String liter=neededGrades.getLiterGrades();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Math Grades: "+ math);
		System.out.print("Add grade: "); 
		math+=" "+scanner.nextLine();
		
		System.out.println("Literature Grades: "+ math);
		System.out.print("Add grade: "); 
		liter+=" "+scanner.nextLine();
		scanner.close();
		Grades newGrade=new Grades(id, math, liter);
		grades.remove(neededGrades);
		grades.add(newGrade);
		
		try (BufferedWriter out = new BufferedWriter(new FileWriter("grades.txt"))) {
			for (Grades g: grades) {
				out.write(g.getId()+","+g.getMathGrades()+","+g.getLiterGrades());
				out.write(System.getProperty("line.separator"));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
} 
