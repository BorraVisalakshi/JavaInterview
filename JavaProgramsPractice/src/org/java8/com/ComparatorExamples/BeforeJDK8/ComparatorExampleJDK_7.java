package org.java8.com.ComparatorExamples.BeforeJDK8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExampleJDK_7 {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		
		empList.add(new Employee("David", 177694, 23));
		empList.add(new Employee("Joe", 187700, 25));
		empList.add(new Employee("Kevin", 187600, 35));
		empList.add(new Employee("Alex", 187693, 24));

		System.out.println("Before Sorting");
		for (Employee employee : empList) {

			System.out.println(employee);
		}
		System.out.println("------------------------------------------");
		
		// Before Java8
		Collections.sort(empList, new EmployeeSort());

		System.out.println("After Sorting" );
		for (Employee employee : empList) {

			System.out.println(employee);
		}

	}
}
