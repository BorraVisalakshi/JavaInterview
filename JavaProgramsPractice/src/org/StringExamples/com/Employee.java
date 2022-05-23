package org.StringExamples.com;

import java.util.HashMap;
import java.util.Map;

public class Employee {
	
	int id;
	String name;
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		
		return name;
	
	}
	public int hashCode(){
		return 1;
     }
    public boolean equals(Object obj){
		return true;
     }
	public static void main(String[] args) {
		
		Employee e1 = new Employee(10,"Pawan");
		Employee e2 = new Employee(20,"Sachin");
		Employee e3 = new Employee(20,"Surya");
		Map<Integer, Employee> map = new HashMap<>();
		map.put(e1.id,e1);
		map.put(e2.id,e2);
		map.put(e3.id,e3);
		System.out.println("printing map " +map);
	}
}
