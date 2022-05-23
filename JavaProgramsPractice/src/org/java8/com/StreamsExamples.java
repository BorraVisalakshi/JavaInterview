package org.java8.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsExamples {
	
	public static void main(String[] args) {
		
		//print and copy 
		Integer[] arr= {2,1,3,6,4,7,5,8,9,5,3,6,7};
		List<Integer> arr1=Arrays.asList(arr);
		arr1.stream()
		//.map(x->x).collect(Collectors.toList())
		.forEach(x->{
			System.out.print(" "+x);
		});
		
		//frequent elements- frequency of elements
		Map<Integer, Long> ar=arr1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		ar.forEach((key,value)->
		{
			System.out.println("-----"+key+" "+value);
		});
		
		TreeSet<Integer> arr2= arr1.stream().collect(Collectors.toCollection(TreeSet::new));
		System.out.println(arr2);
		
	    //print duplicate elements
		Set<Integer> a1=arr1.stream().filter(i -> Collections.frequency(arr1, i) > 1).collect(Collectors.toSet());
		System.out.println(a1);
		
		//reverse array
		 Collections.reverse(Arrays.asList(arr));
	     System.out.println(Arrays.asList(arr));
	     
	     
	     
	     //even numbers
	     List<Integer> a2=arr1.stream().filter(x-> x%2==0).collect(Collectors.toList());
	     System.out.println(a2);
	     
	     //odd numbers
	     List<Integer> a3=arr1.stream().filter(x->x%2!=0).collect(Collectors.toList());
	     System.out.println(a3);
	     
	     //even numbers
	     List<Integer> a4=arr1.stream().map(x-> x).collect(Collectors.toList());
	     System.out.println(a4);
	     
	     // even and odd
	      Map<Boolean,List<Integer>> n=arr1.stream().distinct().sorted().collect(Collectors.partitioningBy(x->x%2==0));
		  System.out.println("even numbers :" + n.get(true));
		  System.out.println("odd numbers :" + n.get(false));
	     
	     IntSummaryStatistics summary=arr1.stream().mapToInt(x->x).summaryStatistics();
	     System.out.println("Max number"+":"+summary.getMax());
	     System.out.println("Min number"+":"+summary.getMin());
	     System.out.println("Count number"+":"+summary.getCount());
	     System.out.println("Sum number"+":"+summary.getSum());
	     System.out.println("Average number"+":"+summary.getAverage());
	     
	     //Sort
	    arr1.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(x->{System.out.print(x+" ");});
	    System.out.println();
	    
	    //remove duplicates
	    System.out.println(arr1.stream().distinct().collect(Collectors.toList()));
	    
	    //Sort with reverse
	    System.out.println(arr1.stream().sorted().collect(Collectors.toList()));
	    
	    //Sort descending
	    Arrays.sort(arr,Collections.reverseOrder());
	    System.out.println(Arrays.toString(arr));
	    
	    //reverse order
	    Collections.reverse(arr1);
	    System.out.println(arr1);
	    
	}

}
