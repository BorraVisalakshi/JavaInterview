package org.java8.com.ComparatorExamples.BeforeJDK8;

import java.util.Comparator;

public class EmployeeSort implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getName().compareTo(e2.getName());
	}

}
