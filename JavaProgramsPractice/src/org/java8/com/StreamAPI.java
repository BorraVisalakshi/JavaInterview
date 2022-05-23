package org.java8.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
	
	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Papaya");
		
		//To add all elements to streans and collect Objects
		fruits.stream().collect(Collectors.toList());
		fruits.forEach(System.out::println);
		
		Stream<Integer> list = Stream.of(1,2,45,66,87,99,100);
		list.forEach(System.out::println);
		
		//Stream<String> stream = 
		
		
	}

}
