package org.java8.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamFunctions {
	
	public static void main(String[] args) {
		
		//Stream.of()
		
		Stream<Integer> stream = Stream.of(1,3,5,6,8,9,3,2,1,0);
		/** 
		 * Lambda expression to print elements of Stream
		    --> stream.forEach(x->System.out.println(x));
		 * Method reference to print elements of Stream
		 **/
		stream.forEach(System.out::println);
		System.out.println("----------------------------------------------------------------");
		//Stream.of(array)
		
		Stream<Integer> streamArray = Stream.of(new Integer[] {12,36,15,60,18,90,53,22,11,100});
		streamArray.forEach(System.out::println);
		System.out.println("----------------------------------------------------------------");
		
		//List.stream()
		
		List<Integer> list = new ArrayList<Integer>();

		for(int i = 1; i<=10; i++){
		      list.add(i);
		}
		list.stream().forEach(System.out::println);
		System.out.println("----------------------------------------------------------------");
		
		
		
	}

}
