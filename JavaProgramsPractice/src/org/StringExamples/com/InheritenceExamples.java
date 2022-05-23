package org.StringExamples.com;

public class InheritenceExamples {
	
	
 public static void main(String[] args) {
	
	 Shape obj = new Circle();
	// ((Circle) obj).draw();  --> To call method of Circle, we need to upcast the refernce variable to that respt. class
	// obj.draw(); // for private methods we cannot access through child class it will through error
	 obj.draw();  // for static methods it cannot be overridden, so output will be in "InShape"
//	 Circle circle = new Circle();
//	 circle.art();
//	 circle.artist();
//	 circle.draw();
	 
	// Circle circle1 = (Circle) new Shape();
	 
	 
 }
}
class Shape{
	
//	Shape(String msg){
//		System.out.println(msg);
//		}
	 void draw(){
		
		System.out.println("In Shape");
	}
	 void artist() {
		 System.out.println("In Shape artist");
	 }
}

class Circle extends Shape {
	
//Circle(String msg) {
//		super(msg);
//		// TODO Auto-generated constructor stub
//	}

	 void draw(){
		
		System.out.println("In Circle");
	}
	 void art() {
		 System.out.println("In Circle art method");
	 }
	
}





/**
 * For default methods- in compile time class parent class method / in runtime class sub-class method
 * For public methods is also same
 * For protected methods is also same
 * For private methods- we cannot access the methods from object, bcz they are accessed through only current class reference
 * 
 * 
 * <blockquote> obj.art(); -- We cannot call a method from super class refrence that is not present in Super class
 *  
 *  With super class reference we can only call the overridden subclass methods </blockquote>
 *  
 *  
 * Circle circle = new Circle();
	 circle.art();
	 circle.artist();
	 circle.draw();
	 
	 With subclass reference we can access all the methods of super class as well as subclass
	 
	 We cannot create subclass reference to a super class object
 * **/
