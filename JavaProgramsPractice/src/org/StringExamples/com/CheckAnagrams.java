package org.StringExamples.com;

import java.util.Arrays;

public class CheckAnagrams {
	
	public static void main(String[] args) {
		
		String s1 = "Grab";
		String s2 = "Barg";
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1.length() != s2.length()) {
			
			System.out.println("Not Anagram");
		}
		else {
			char[] char1 = s1.toCharArray();
			char[] char2 = s2.toCharArray();
			
			Arrays.sort(char1);
			System.out.println(char1);
			Arrays.sort(char2);
			System.out.println(char2);
			
			if(Arrays.equals(char1, char2) == true) { 
				
	             System.out.println("Both the strings are anagram");  
	         }  
	         else {  
	        	 
	             System.out.println("Both the strings are not anagram");  
	         }
		}
		   
	}

}
