package org.prototypedesignpatterns.com;

import java.util.List;

public class MainClass {
	
	 public static void main(String[] args) throws CloneNotSupportedException {
		 
		 StudentDAO dao = new StudentDAO();
		 List<Students> list = StudentDAO.getStudentList();
		 
		 List<Students> updatedList = (List<Students>) dao.clone();
		 
		 Students std = new Students();
		 std.setId(30);
		 std.setName("Vishalii");
		 
		 updatedList.add(std);
		 
		  System.out.println("Original Student List::");
		  list.forEach(System.out::println);
			
			System.out.println("Updated Student List::");
			updatedList.forEach(System.out::println);
	}

}
