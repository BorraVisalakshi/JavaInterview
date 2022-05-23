package org.java8.com.ComparatorExamples.WithJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.java8.com.ComparatorExamples.BeforeJDK8.Employee;

public class MainLambdaImpl {
	
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee("David", 177694, 23));
		empList.add(new Employee("Joe", 187700, 25));
		empList.add(new Employee("Bala", 187653, 30));
		empList.add(new Employee("Kevins", 187600, 35));
		empList.add(new Employee("Alexa", 187693, 24));
		
		Collections.sort(empList, (e1,e2) -> e1.getName().compareTo(e2.getName()));
		System.out.println("After Sorting using Lambda Expression");
		for (Employee employee : empList) {
			System.out.println(employee);
		}
	

	}

}
