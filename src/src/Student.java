package src;

import java.util.Scanner;

public class Student {
//declare variables
private int id;
private String name;
private int age;


//constructor
public Student(int id, String name, int age) {
	this.id = id;
	this.name = name;
	this.age = age;
}


//getters and setters 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String leer) {
	this.name = leer;
} 

public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
} 

}
