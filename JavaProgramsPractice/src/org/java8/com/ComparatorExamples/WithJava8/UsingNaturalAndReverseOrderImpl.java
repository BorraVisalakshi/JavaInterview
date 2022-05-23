package org.java8.com.ComparatorExamples.WithJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.java8.com.ComparatorExamples.BeforeJDK8.Employee;

public class UsingNaturalAndReverseOrderImpl {
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee("David", 177694, 23));
		empList.add(new Employee("Joe", 187700, 25));
		empList.add(new Employee("Bala", 187653, 30));
		empList.add(new Employee("Kevins", 187600, 35));
		empList.add(new Employee("Alexa", 187693, 24));
		
		//Comparator Natural order
		List<String> nameList = empList.stream().map(Employee::getName).collect(Collectors.toList());
		nameList.sort(Comparator.naturalOrder());
		System.out.println("--------------Natural Order------------");
		nameList.forEach(System.out::println);
		
		//Comparator Reverse Order
		List<String> nameListReverse = empList.stream().map(Employee::getName).collect(Collectors.toList());
		nameListReverse.sort(Comparator.reverseOrder());
		System.out.println("--------------Reverse Order------------");
		nameListReverse.forEach(System.out::println);
		
		//List reversed() method
		Comparator<Employee> compReverse = Comparator.comparing(Employee::getName);
		empList.sort(compReverse.reversed());
		System.out.println("--------------List reversed Order------------");
		nameListReverse.forEach(System.out::println);
	}

}
