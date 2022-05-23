package org.StringExamples.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountDuplicateCharacters {
	public static void main(String[] args) {
		
	
	String arr="123124567";
	char[] arr1=arr.toCharArray();
	Map<Character, Integer> mapCount = new HashMap<>();
	int count = 0;
	
	for (int i = 0; i < arr1.length; i++) {
		if (mapCount.containsKey(arr1[i])) {
			
			count = mapCount.get(arr1[i]);
			mapCount.put(arr1[i], count+1);
			
		} 
		else {
			mapCount.put(arr1[i], 1);
		}
	}
	System.out.println(mapCount);
	
	for (Entry<Character, Integer> entry : mapCount.entrySet()) {
//		System.out.println(entry.getKey() + "-" + entry.getValue());
		if(entry.getValue() > 1) {
			System.out.println(entry.getKey());
		}
		
	}
  }
}