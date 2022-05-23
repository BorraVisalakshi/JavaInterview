package org.StringExamples.com;

public class CountCharacters {
	String str = "Hello Hello Good Morning Bangalore?!";
	static int count =0;
	static int punctuation=0;
	
	public void countChar() {
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != ' ') {
				
				count++;		
			}
		}	
	}

	public void countPunctuations() {
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
					str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {
				
				punctuation++;		
			}
		}	
	}
	
	public static void main(String[] args) {
		
		CountCharacters cc = new CountCharacters();
		cc.countChar();
		System.out.println("Count the characters is "+ count);
		
		cc.countPunctuations();
		System.out.println("No of punctuations is "+ punctuation);
	}

}
