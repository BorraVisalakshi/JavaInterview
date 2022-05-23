package org.arrays.com;


public class PrintMinMaxValue {
	
	public static void main(String[] args) {
		
		int arr[] = {1,8,9,3,0,6,7,-1};
		int min =0;
		int max =0;
		int max_index = 0;
		int min_index =0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i] < min){
				
				min= arr[i];
				min_index =i;
				
			}
			else if(arr[i] > max) {
				max = arr[i];
				max_index =i;
			
			}
		}
		System.out.println("Min value in an array is - " +min+" its index is"+min_index);
		System.out.println("Max value in an array is - " +max+" its index is"+max_index);
	}

}
