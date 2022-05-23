package org.prototypedesignpatterns.com;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements Cloneable {
	
	private static List<Students> studentsList = null;
	
	static {
		 
		studentsList = new ArrayList<>();
		
		Students std1 = new Students();
		std1.setId(10);
		std1.setName("Vishali");
		
		Students std2 = new Students();
		std2.setId(20);
		std2.setName("Vish");
		
		studentsList.add(std1);
		studentsList.add(std2);

	}
	//method 1 which returns original list of students
	 public static List<Students> getStudentList() {
		 
		return studentsList;
		 
	 }
	 
	 /** Trying to create another object from Student class, so creating Object cloning
	  * By implementing Cloneable class
	  * and overriding clone method present in Object class
	  * In overidden method clone the Student object, which helps us to perform other operations*/
	 
	 @Override
	public Object clone() throws CloneNotSupportedException {
		
		 List<Students> newUpdatedobjects = new ArrayList<>();
		 
			for (Students student : studentsList) {
				
				newUpdatedobjects.add(student);
			}
			return newUpdatedobjects;
	}

}
