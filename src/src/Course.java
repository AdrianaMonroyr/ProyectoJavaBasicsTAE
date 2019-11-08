package src;

import java.util.ArrayList;
import java.util.List;

public class Course {
//declare variables
public String name;
public int classroom;
public int idTeacher;
public List<Student> studentList;

//constructor
public Course(String name, int classroom,int idTeacher,List<Student> studentList) {
	this.name = name;
	this.classroom = classroom;
	this.studentList = studentList;
	
	}

//getters and setters
public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getClassroom() {
	return classroom;
}


public void setClassroom(int classroom) {
	this.classroom = classroom;
}


public int getIdTeacher() {
	return idTeacher;
}


public void setIdTeacher(int idTeacher) {
	this.idTeacher = idTeacher;
}

public List<Student> getStudentList() {
	return studentList;
}

public void setStudentList(List<Student> studentList) {
	this.studentList = studentList;
}






}
