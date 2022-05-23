package org.java8.com.ComparatorExamples.WithJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.java8.com.ComparatorExamples.BeforeJDK8.Employee;

public class UsingComparingIntImpl {
	
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee("David", 197694, 23));
		empList.add(new Employee("Joe", 187700, 25));
		empList.add(new Employee("Bala", 187653, 30));
		empList.add(new Employee("Kevins", 187600, 35));
		empList.add(new Employee("Alexa", 187693, 24));
		empList.add(new Employee("Bala", 187695, 22));
		empList.add(new Employee("Alexa", 107699, 24));
		
		//Using comparingInt
		Comparator<Employee> comp = Comparator.comparingInt(Employee::getAge);
		Collections.sort(empList, comp);
		empList.forEach(System.out::println);
		
		//Using comparingLong method
		Comparator<Employee> compLong = Comparator.comparingLong(Employee::getEmpId);
		Collections.sort(empList, compLong);
		System.out.println("By Using comparingLong method");
		empList.forEach(System.out::println);
		
		//Using thenComparing Method
		Comparator<Employee> thenCompLong = Comparator.comparing(Employee::getName).thenComparingLong(Employee::getEmpId);
		Collections.sort(empList, thenCompLong);
		System.out.println("--------------By Using ThencomparingLong method----------------");
		empList.forEach(System.out::println);
		
	}

}
