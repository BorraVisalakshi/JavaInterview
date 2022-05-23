package org.StringExamples.com;

public class LongestPalindrome {
	
	public static void main(String[] args) {
		
		String str = "babad";
		String str1="";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			
			if(str.substring(0,i) !=null) {
				
				str1 = str1+ str.charAt(i);
				System.out.println(str1);
				
			}
		}
	}

}
