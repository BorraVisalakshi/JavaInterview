package org.java8.com.ComparatorExamples.WithJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.java8.com.ComparatorExamples.BeforeJDK8.Employee;

public class UsingComparingMethodImpl {
	
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee("David", 177694, 23));
		empList.add(new Employee("Joe", 187700, 25));
		empList.add(new Employee("Bala", 187653, 30));
		empList.add(new Employee("Kevins", 187600, 35));
		empList.add(new Employee("Alexa", 187693, 24));
		
		//By comparing only emp object
		Comparator<Employee> comp = Comparator.comparing(Employee::getName);
		Collections.sort(empList, comp);
		empList.forEach(Employee::getName);
		
	   
		//By comparing emp obj with other args
		Comparator<Employee> compEmp = Comparator.comparing(Employee::getName,String.CASE_INSENSITIVE_ORDER);
		Collections.sort(empList, compEmp);
		empList.forEach(System.out::println);
		
	}

}
