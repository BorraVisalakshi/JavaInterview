package org.StringExamples.com;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesWords {
	
	public static void main(String[] args) {
		
		String str = "Big black bug bit a big black dog on his big black nose";
//Split -method : after every space it splits the sentence
		str = str.toLowerCase();
		String arr[] = str.split(" ");
//		Map<String, Integer> map = new HashMap<>();
//		
//		for(int i =0; i<arr.length; i++) {
//			
//			if(map.containsKey(arr[i])) {
//				
//			}
//			
//		}
		
		for(int i=0; i<arr.length; i++) {
			int count =1;
			for(int j=i+1; j<arr.length;j++) {
				
				if(arr[i].equals(arr[j])) {
					
					count++;
					arr[j]="0";
				}
			}
			if(count>1 && arr[i] != "0") {
				
				System.out.println("duplicates are " + arr[i]);
			}		
			
		}
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]!="0") {
				System.out.print(arr[i]+ " ");
				
			}
		}
				
	}

}
