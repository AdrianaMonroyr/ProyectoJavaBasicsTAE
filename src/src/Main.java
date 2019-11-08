package src;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class Main {

	
	
	public static void main(String[] args) throws IOException {
//call the method that contain the menu
		run();
		
//create the object university
	Universidad universidad = new Universidad("UNAM");
	
//indicate the character to exit and declare the variable that receive the option in the menu
		char exit = '6'; char option = (char)System.in.read();
		
		
		while(option != exit) {
			switch (option) {
			case '1':
			System.out.println("Teachers List:");
			universidad.printTeacher();
			break;
			case '2':
				System.out.println("Select the Course that you want to see:");
				universidad.submenu();
				
				break;
			case '3':				
				universidad.addStudent();
				//universidad.printStudent();
				break;
			case '4':
				universidad.addCourse();
				//universidad.printCourse();
				break;
			case '5':
				
				break;
			}option = (char) System.in.read();
			
		}
	}

//Print a menú
	public static void run() {
		System.out.println("OPTIONS:");
		System.out.println("1 Print all the professors");
		System.out.println("2 Print classes");
		System.out.println("3 Create a new student");
		System.out.println("4 Create a new class");
		System.out.println("5 List all the classes in which a given student is included");
		System.out.println("6 Exit");
	}
	
	
}
