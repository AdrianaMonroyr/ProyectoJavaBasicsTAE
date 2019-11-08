package src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

public class Teacher {
//declare the variables
	private int idTeach;
	private String name; 
	private String type;
	private float baseSalary=100;
	private float salary;
	private float time;
	
	

	
//constructor
public Teacher(int idT,String name,String type, int time) {
	this.idTeach = idT;
	this.name = name;
	this.type = type;
	this.time = time;
	this.salary = calculateSalary() ;
	}

//getters and setters
public int  getId() {
	return idTeach;
}

public void setId(int idTeach) {
	this.idTeach = idTeach;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getType() {
	return type;
}


public void setType(String type) {
	this.type = type;
}

public float getBaseSalary() {
	return baseSalary;
}

public void setTime(float time) {
	this.time = time;
}

public float getTime() {
	return time;
}

public void setBaseSalary(float baseSalary) {
	this.baseSalary = baseSalary;
}


//Method to calculate the salary of the teachers
public float calculateSalary() {
	
	float salary = 0;
		
	if (type == "Full") {
		salary = (float) (this.baseSalary *(this.time*1.1));

		
		return salary;
		
	}else if (type == "Part") {
		salary = this.baseSalary * this.time;
	
	
		return salary;
	}	
	System.out.println(salary);

	return salary;

	
}
	
}
