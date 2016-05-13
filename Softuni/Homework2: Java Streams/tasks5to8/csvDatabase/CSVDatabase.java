package tasks5to8.csvDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CSVDatabase {

	public static void main(String[] args) {
		CSVDatabase db=new CSVDatabase();
		//db.searchByFullname("Mariana Ivanova");
		//db.searchById(6);
		//db.searchById(17);
		db.deleteById(5);
		
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
	
} 
