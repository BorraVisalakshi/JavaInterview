package org.java8.com.StreamsEmployee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeStreamFunctions {

	static List<Employee> employeeList = new ArrayList<Employee>();

	public static void main(String[] args) {

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		employeeList.add(new Employee(288, "Akshara Singania", 24, "Female", "Product Development", 2019, 38800.0));
		employeeList.add(new Employee(299, "Abhimanyu Birla", 26, "Male", "HR", 2016, 40800.0));
		employeeList.add(new Employee(333, "Kaira Goenka", 30, "Male", "Infrastructure", 2014, 42800.0));

		// Query 1 : How many male and female employees are there in the organization?
		method1();
		System.out.println("\n");

		// Query 2 : Print the name of all departments in the organization?
		method2();
		System.out.println("\n");

		// Query 3 : What is the average age of male and female employees?
		method3();
		System.out.println("\n");

		// Query 4 : Get the details of highest paid employee in the organization?
		method4();
		System.out.println("\n");

		// Query 5 : Get the names of all employees who have joined after 2015?
		method5();
		System.out.println("\n");

		// Query 6 : Count the number of employees in each department?
		method6();
		System.out.println("\n");
		
		//Query 7 : What is the average salary of each department?
		method7();
		System.out.println("\n");
		
		//Query 8 : Get the details of youngest male employee in the product development department?"
		method8();
		System.out.println("\n");
		
		//Query 9 : Who has the most working experience in the organization?
		method9();
		System.out.println("\n");
		
	    //Query 10 : How many male and female employees are there in the sales and marketing team?
		method10();
		System.out.println("\n");
		
		//Query 11 : What is the average salary of male and female employees?
		method11();
		System.out.println("\n");
		
		//Query 12 : List down the names of all employees in each department?
		method12();
		System.out.println("\n");
		
		//Query 13 : What is the average salary and total salary of the whole organization? -USING SUMMARY STATISTICS
		method13();
		System.out.println("\n");
		
		//Query 14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.-USING PARTITION BY -BOOLEAN
		method14();
		System.out.println("\n");
		
		//Query 15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
		method15();
		System.out.println("\n");
		
		//Query 16 : Find the employees whose name start with A , and make them Upper case
		method16();
		System.out.println("\n");
		
		//Query 17 : Find the employees whose name start with A and sort with salary is same and print details in ASCII order
		method17();
		System.out.println("\n");
		
		//Query 18 : Print the list of employees in Ascending order of their names
		method18();
		System.out.println("\n");
	}

	public static void method1() {

		System.out.println("Query 1 : How many male and female employees are there in the organization?");
		Map<String, Long> map = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(map);

	}

	public static void method2() {
		
		System.out.println("Query 2 : Print the name of all departments in the organization?");
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
//		System.out.println("Query 3 : No of employeess in all depts");
//		Map<String, Long> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
//		System.out.println(map);

	}

	public static void method3() {
		System.out.println("Query 3 : What is the average age of male and female employees?");
		Map<String, Double> map = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
		System.out.println(map);

		// Optional case - to iterate a Map with Entry set
//		for (Map.Entry<String, Double> entry : map.entrySet()) {
//			String key = entry.getKey();
//			System.out.println(key);
//			Double val = entry.getValue();
//			System.out.println(val);
//			
//		}
	}

	public static void method4() {

		System.out.println("Query 4 : Get the details of highest paid employee in the organization?");
		Optional<Employee> emp = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		//Optional<Employee> emp1 = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
		System.out.println(emp.get().getName());
		System.out.println(emp.get().getSalary());
	}

	public static void method5() {

		System.out.println("Query 5 : Get the names of all employees who have joined after 2015?");
		employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName)
				.forEach(System.out::println);
	}

	public static void method6() {

		System.out.println("Query 6 : Count the number of employees in each department?");
		Map<String, Long> map = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(map);
		// Iterate through EntrySet to get key value pair
		for (Entry<String, Long> entry : map.entrySet()) {

			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
	}

	public static void method7() {

		System.out.println("Query 7 : What is the average salary of each department?");
		Map<String, Double> map = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(map);
		// Iterate through EntrySet to get key value pair
		for (Entry<String, Double> entry : map.entrySet()) {

			System.out.println(entry.getKey() + "Avg-sal is- " + entry.getValue());
		}

	}
	
	public static void method8() {
		
		System.out.println("Query 8 : Get the details of youngest male employee in the product development department?");
		Optional<Employee> emp = employeeList.stream().filter(e-> e.getGender() == "Male" && e.getDepartment() =="Product Development")
				                 .min(Comparator.comparingInt(Employee::getAge));
		System.out.println("Youngest employee in Product Development Team is - "+emp.get().getName() + "Age:"+ emp.get().getAge());
		
	}
	
	public static void method9() {
		
		System.out.println("Query 9 : Who has the most working experience in the organization?");
		Optional<Employee> emp = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
		System.out.println(emp.get().getName());
	}
	
	public static void method10() {
		
		System.out.println("Query 10 : How many male and female employees are there in the sales and marketing team?");
		Map<String, Long> map = employeeList.stream().filter(e->e.getDepartment() == "Sales And Marketing")
				                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(map);
	}
	public static void method11() {
		
		System.out.println("Query 11 : What is the average salary of male and female employees?");
		Map<String, Double> map = employeeList.stream()
				                 .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(map);
	}
	public static void method12() {
		
		System.out.println("Query 12 : List down the names of all employees in each department?");
		Map<String, List<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		for(Entry<String, List<Employee>> entry : map.entrySet()) {
			
			System.out.println("--------------------------------------");
            
		    System.out.println("Employees In "+entry.getKey() + " : ");
		             
		    System.out.println("--------------------------------------");
		             
		    List<Employee> list = entry.getValue();
		             
		    for (Employee e : list) 
		    {
		        System.out.println(e.getName());
		    }
		}
	}
	public static void method13() {
		System.out.println("Query 13 : What is the average salary and total salary of the whole organization?");
		DoubleSummaryStatistics stats = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Avg Salary is - "+stats.getAverage());
		System.out.println("Tot Salary is - "+stats.getSum());
		System.out.println("Min Salary is - "+stats.getMin());
		System.out.println("Max Salary is - "+stats.getMax());
		System.out.println("Count total Emp is - "+stats.getCount());
	}
	
	public static void method14() {
		
		System.out.println("Query 14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.");
		Map<Boolean, List<Employee>> map = employeeList.stream().collect(Collectors.partitioningBy(e->e.getAge() > 25));
		
		for(Entry<Boolean,List<Employee>> entry : map.entrySet()) {
			
			System.out.println("----------------------------");
		    if (entry.getKey()) 
		    {
		        System.out.println("Employees older than 25 years :");
		    }
		    else
		    {
		        System.out.println("Employees younger than or equal to 25 years :");
		    }
		    System.out.println("----------------------------");
		    List<Employee> list = entry.getValue();
		    for (Employee e : list) 
		    {
		        System.out.println(e.getName());
		    }
		  }
			
		}
	
	public static void method15() {
		
		System.out.println("Query 15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?");
		Optional<Employee> emp = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
		System.out.println("Oldest emp and his dept is - "+ emp.get().getName()+ " Dept: "+ emp.get().getDepartment()+" Age " + emp.get().getAge());
		
	}
	public static void method16() {
		
		System.out.println("Query 16 : Find the employees whose name start with A , and make them Upper case");
		
		List<String> map = employeeList.stream().filter(e->e.getName().startsWith("A")).map(e->e.getName().toUpperCase())
				   .collect(Collectors.toList());
				                
		System.out.println(map);

	}
	public static void method17() {
		
		System.out.println("Query 17 : Find the employees whose name start with A and sort with salary is same and print details in ASCII order.");
		List<Employee> map = employeeList.stream().filter(e->e.getName().startsWith("A"))
		               .sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)).collect(Collectors.toList());
		
		map.forEach(e->System.out.println(e.getName() +"-"+ e.getSalary()));
		 
	}
	public static void method18() {
		
		System.out.println("Query 18 : Print the list of employees in Ascending order of their names");
		//employeeList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(e->System.out.println(e.getName()));
		List<String> map = employeeList.stream().map(Employee::getName).collect(Collectors.toList());
		map.sort(Comparator.naturalOrder());
		map.forEach(System.out::println);
	}
}

