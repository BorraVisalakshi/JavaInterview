package org.StringExamples.com;

public class VowelsAndConst {
	
	public static void main(String[] args) {
		
		String str = "Hello Good Morning everyone";
		int vowels = 0;
		int consts = 0;
		
		
		for(int i =0; i<str.length(); i++) {
			
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ) {
				
				vowels++;
			}
			else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
				
				consts++;
			}
		}
		 System.out.println("No  of vowels - "+vowels);
		 System.out.println("No  of consts - "+consts);
		
	}

}
