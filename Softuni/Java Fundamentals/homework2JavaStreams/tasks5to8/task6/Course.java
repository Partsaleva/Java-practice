package homework2JavaStreams.tasks5to8.task6;

import java.io.Serializable;

public class Course implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nameOfCourse;
	private int numberOfStudents;
	
	public Course(String nameOfCourse, int numberOfStudents) {
		this.nameOfCourse = nameOfCourse;
		this.numberOfStudents = numberOfStudents;
	}

	public String getNameOfCourse() {
		return nameOfCourse;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	@Override
	public String toString() {
		return "Course [nameOfCourse=" + nameOfCourse + ", numberOfStudents=" + numberOfStudents + "]";
	}
	
	
	
}
