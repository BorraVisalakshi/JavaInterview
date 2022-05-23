package org.StringExamples.com;

public class CheckPalindrome {
	
	public static void main(String[] args) {
		
		String s1="Bob";
		String s2="";
		
	    for(int i=s1.length()-1;i>=0;i--) {
	    	
	    	s2=s2+s1.charAt(i);
	    	//
	    }
	    System.out.println("array s2 is- " + s2);
	    
	    if(s1.equalsIgnoreCase(s2)) {
	    
	    	System.out.println("palindrome");
	    }
	    else {
	    	
	    	 System.out.println("Not palindrome");
	    }
	}

}
