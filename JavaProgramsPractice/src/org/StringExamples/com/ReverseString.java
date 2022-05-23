package org.StringExamples.com;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str = "Good";
		String str1 = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			
			str1= str1+str.charAt(i);
			
		}	
		
		//str1= str1.toUpperCase().charAt(0);
		
		System.out.println(str1);
		String firstLetter = str1.substring(0,1);
		str1=str1.substring(1);
		str1 =firstLetter.toUpperCase()+str1;
		System.out.println("After captilizing first letter "+str1);
		
		//With reverse method
		
//		StringBuilder builder = new StringBuilder(str1);
//		 builder.reverse();
//		 System.out.println(builder.toString());
	}

}
