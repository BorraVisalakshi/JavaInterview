package org.StringExamples.com;

import java.util.Arrays;

public class StringCode {
	
	public static void main(String[] args) {
		
		String S = "azABaabza";
		String s2 = "";
		char[] ch = S.toCharArray();
		Arrays.sort(ch);
		
		for(int i=S.length()-1; i>0; i--) {
			s2=s2+S.charAt(i);
				
		}
		System.out.println(s2+ "String s2");
		
		//if(ch == 'A' || ch=='Z' )
		for(int i = 0; i< ch.length; i++) {
			
			if(ch[i] == 'A' || ch[i] =='Z') {
				
			}
		}
		
	}

}
