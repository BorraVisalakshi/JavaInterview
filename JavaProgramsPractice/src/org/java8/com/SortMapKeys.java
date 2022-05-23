package org.java8.com;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapKeys {
	public static void main(String[] args) throws Exception {

		// a Map with string keys and integer values
		Map<String, Integer> budget = new HashMap<>();
		budget.put("clothes", 120);
		budget.put("grocery", 150);
		budget.put("transportation", 100);
		budget.put("utility", 130);
		budget.put("rent", 1150);
		budget.put("miscellneous", 90);

	System.out.println("map before sorting: " + budget);
	//sort map by key	
	Map<String, Integer> result =	budget.entrySet().stream().sorted(Map.Entry.comparingByKey())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
	
	System.out.println("-----"+ result);
	
	//other way sort by key
	 Map<String, Integer> result2 = new LinkedHashMap<>();
     budget.entrySet().stream().sorted(Map.Entry.comparingByKey())
             .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));
     System.out.println(result2+"-------");
     
   //sort by values
 	
 	 Map<String, Integer> sortbyValues = budget.entrySet().stream()
              .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
              .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                      (oldValue, newValue) -> oldValue, LinkedHashMap::new));
 	 
 	 System.out.println(sortbyValues+"#######");
 	 
 	 //sortby valyes in other way
 	Map<String, Integer> sortValue = new LinkedHashMap<>();
 	budget.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x->sortValue.put(x.getKey(), x.getValue()));
 	System.out.println(sortValue+"***********");

	}

    
}
