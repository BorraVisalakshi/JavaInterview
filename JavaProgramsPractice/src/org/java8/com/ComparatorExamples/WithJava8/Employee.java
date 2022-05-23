package org.java8.com.ComparatorExamples.WithJava8;

public class Employee {
	
	private String name;
	private long empId;
	private int age;
	
	public Employee(String name, long empId, int age) {
		super();
		this.name = name;
		this.empId = empId;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", age=" + age + "]";
	}

}
