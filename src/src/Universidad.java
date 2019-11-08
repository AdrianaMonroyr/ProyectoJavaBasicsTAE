package src;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Universidad {
	
// list of teachers, a list of students and a list of classes	
	
	private List<Student> studentList = new ArrayList<>();
	private List<Course> courseList = new ArrayList<>();
	private List<Teacher> teacherList = new ArrayList<>();
	
	
	
	public Universidad(String name) {
		
//Initialize minimum 2 different teachers of each type (full time, part time).

		
		this.addTeacher(new Teacher(1,"Marie Curie","Full",1));
		this.addTeacher(new Teacher(2,"Bill Gates","Full",2));
		this.addTeacher(new Teacher(3,"Steve Jobs","Full",3));
		this.addTeacher(new Teacher(4,"Ada Lovelace","Full",4));
		this.addTeacher(new Teacher(5,"Mark Zuckerberg","Part",5));
		this.addTeacher(new Teacher(6,"Jeff Bezos","Part",6));
		this.addTeacher(new Teacher(7,"Thomas Edison","Part",7));
		this.addTeacher(new Teacher(8,"Nikola Tesla","Part",8));
		
//Initialize minimum 6 different students
		
		this.studentList.add(new Student(01,"Adriana",18));
		this.studentList.add(new Student(02,"Fernanda",16));
		this.studentList.add(new Student(03,"Maria",17));
		this.studentList.add(new Student(04,"Andres",20));
		this.studentList.add(new Student(05,"Jorge",21));
		this.studentList.add(new Student(06,"Pablo",22));
		
//Initialize minimum 4 different classes including its teacher , students and other relevant data
		
		this.courseList.add(new Course ("Física",01,1,studentList));
		this.courseList.add(new Course("Matemáticas",02,3,studentList));
		this.courseList.add(new Course("Lenguaje",03,8,studentList));
		this.courseList.add(new Course("Programación",04,4,studentList));
		
		
		
	}
	
//Method to add teachers into the list
	public void addTeacher(Teacher teacher) {
		teacherList.add(teacher);
		
	}
	
//Method to add students into the list by the user in the menu
	public void addStudent() {
		Scanner leer = new Scanner(System.in);
			
			System.out.println("New student:");
			System.out.println("Add the student Id ");
			int id = leer.nextInt();
			//id = mystudent.setId(id);
			System.out.println("add the student name");
			String name = leer.next();
			System.out.println("add the student age ");
			int age = leer.nextInt();
			System.out.println("add the class of the student");
			String clase = leer.next();
			leer.nextLine();
			this.studentList.add(new Student(id,name,age));
			
		
		System.out.println(".....................");
		System.out.println("New list with the new studdent added:");
		printStudent();
	
	}
	
//Method to add classes into the list by the user in the menu
		public void addCourse() {
			Scanner leer = new Scanner(System.in);
			System.out.println("New class");
			System.out.println("add the class name");
			String name = leer.next();
			System.out.println("add the classroom");
			int classroom = leer.nextInt();
			System.out.println("Id profesor");
			int teach = leer.nextInt();
			System.out.println("Id estudiante");
			int estudiante = leer.nextInt();
			leer.nextLine();
			this.courseList.add(new Course(name,classroom,teach,studentList));
			System.out.println(".....................");
			System.out.println("New list with the new class added:");
			printCourse();
		}  
	
	
//Method to print the teachers list
	public void printTeacher() {
		for(int x=0;x<this.teacherList.size();x++) {
			System.out.println("Teacher Name: "+teacherList.get(x).getName()+ "     "+"Type:" + " " + teacherList.get(x).getType() +"    "+"Salary:"+ " " + teacherList.get(x).calculateSalary());
			}
		}
	
//Method to print the students list
	public void printStudent() {
		for(int x=0;x<this.studentList.size();x++) {
			System.out.println("Student Id:"+" "+studentList.get(x).getId() + " " + "Student name:" + " " + studentList.get(x).getName() + " " + "Student age:" + " " + studentList.get(x).getAge());			
		}
		
	}
	
//Method to print the classes list
	public void printCourse() {
		for(int x=0;x<this.courseList.size();x++) {
		System.out.println("Course name:"+ " " + courseList.get(x).getName()+"     "+ "Classroom" + " " + courseList.get(x).getClassroom() + "  " + "Teacher Name:" + "  " + teacherList.get(x).getName());
	}}

	
	public void submenu() throws IOException {
		
		System.out.println("OPTIONS:");
		System.out.println("a Fisica");
		System.out.println("b Matemáticas");
		System.out.println("c Lenguaje");
		System.out.println("d Programación");
		
		char exit = '6'; char option = (char)System.in.read();
		
		while(option != exit) {
		if (option == 'a') {
		
		//System.out.println("Teachers List:");
		System.out.printf("Class name: "+ " " + courseList.get(0).getName() + " " + "Classroom:" + " " + courseList.get(0).getClassroom()+ "  " + "Teacher Name:" + "  " + teacherList.get(0).getName() + " " + "Students name: " + "  " + studentList.get(0).getName() + " , " + studentList.get(1).getName());
		}else if (option == 'b') {
			System.out.printf("Class name: "+ " " + courseList.get(1).getName() + " " + "Classroom:" + " " + courseList.get(1).getClassroom()+ "  " + "Teacher Name:" + "  " + teacherList.get(1).getName() + " " + "Students name: " + "  " + studentList.get(1).getName() + " , " + studentList.get(3).getName());
		}else if (option == 'c') {
			System.out.printf("Class name: "+ " " + courseList.get(2).getName() + " " + "Classroom:" + " " + courseList.get(2).getClassroom()+ "  " + "Teacher Name:" + "  " + teacherList.get(2).getName() + " " + "Students name: " + "  " + studentList.get(0).getName() + " , " + studentList.get(4).getName());
		}else if (option == 'd') {
			System.out.printf("Class name: "+ " " + courseList.get(3).getName() + " " + "Classroom:" + " " + courseList.get(3).getClassroom()+ "  " + "Teacher Name:" + "  " + teacherList.get(3).getName() + " " + "Students name: " + "  " + studentList.get(5).getName() + " , " + studentList.get(3).getName());
		}option = (char) System.in.read();
		}

		
	}
	
}
