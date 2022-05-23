package org.StringExamples.com;

import java.util.ArrayList;
import java.util.List;

public class MonotonicValues {
	
	boolean increasing = true;
	boolean decreasing = true;
	
	public boolean Monotonic(){
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(4);
		list.add(6);
		list.add(7);
		
		//converting list to integer array
		int[] arr = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			
			arr[i] = list.get(i);
			//System.out.println("Array of integers is"+ arr[i]);
		}
		
        for(int i=0; i< arr.length;i++) {
			
			for(int j=i+1; j< arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					
					increasing = false;
				}
				else if(arr[i] < arr[j]) {
					
					decreasing = false;
				}
			}
			if (!increasing && !decreasing){
	            return true;
		}
        
		 
        }
		return true;
		
	}

	public static void main(String[] args) {
		
		
		MonotonicValues mv = new MonotonicValues();
		mv.Monotonic();
		System.out.println(mv.Monotonic());
            
	}
}
	

