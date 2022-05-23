package org.StringExamples.com;

import java.util.Scanner;

public class RemoveSpaces {
	
	 public static void main(String[] args) {
		 
	        String str = "Hello world I am here";
	        String r = "";

	        Scanner sc = new Scanner(str);

	        while(sc.hasNext()) {
	            r += sc.next();
	        }
	        System.out.println(r);
	        
//	        char[] arr = str.toCharArray();
//	         //for (int i=0;)
	        sc.close();
//	        
	    }
	 

}
