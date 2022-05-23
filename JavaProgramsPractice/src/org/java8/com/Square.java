package org.java8.com;

public class Square {
	
	public static void main(String[] args) {
		
		Shape shape = (a, b) -> {
			                    System.out.println("Area of sqaure is:" + a*b);
		                       };
		
		shape.area(4, 5);
		
		
		
	}

}
