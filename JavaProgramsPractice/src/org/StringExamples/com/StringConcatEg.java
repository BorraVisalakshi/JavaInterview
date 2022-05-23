package org.StringExamples.com;

public class StringConcatEg {

	public static void main(String[] args) {
		
		//way 1
		String s1 = "Hello" + "World";
		System.out.println("concat way 1- " +s1);
		
		//way 2
		String s2 = 20+40+"Vishali"+60+80;
		System.out.println("concat way 2- " +s2);
		
		//way 3
		
		String s3 = "Vishali";
		String s4 = "VISHALI";
		String s5 = s3.concat(s4);
		System.out.println("concat way 3- " +s5);
		
		//way 4
		
		StringBuilder s6 = new StringBuilder("Vishali");
		StringBuilder s7 = new StringBuilder("VISHALI");
		
		StringBuilder s = s6.append(s7);
		System.out.println("concat way 4- " +s);
		System.out.println(s.toString());

		//way 5
		
		String s8 = new String("JAVA 8");
		String s9 = new String("String JOIN METHOD");
		String s10 = s8.join("",s8,s9);
		System.out.println(s10);
		System.out.println(s10.toString());
		
		

	}

}
