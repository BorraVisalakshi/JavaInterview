package org.StringExamples.com;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {
	
	public static void main(String[] args) {
		
		String string = "Technology Hello Hi Hello Vish Big Vish";
		string = string.toLowerCase();
		//System.out.println(string);
		//char ch[] = string.toCharArray();
		
		String ch[] = string.split(" ");

		Map<String, Integer> map = new HashMap<>();
		
		for(int i =0; i< ch.length; i++) {
			int count =0;
			if(map.containsKey(ch[i])) {
				
				count = map.get(ch[i]);
				count = count +1;
				map.put(ch[i], count);
				
			}
			else {
				map.put(ch[i], 1);
			}
		}
		System.out.println("Frequency of elements in a string is " + map);
		
		 

	}
}
