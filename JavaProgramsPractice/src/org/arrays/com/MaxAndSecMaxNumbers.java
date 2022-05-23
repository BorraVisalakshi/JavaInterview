package org.arrays.com;

import java.util.Arrays;

public class MaxAndSecMaxNumbers {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {12,87,55,12,65,90};
		
//FIRST and Second largest number in an Array
//		int max1 = arr[0];
//		int max2 = arr[0];
//		
//		for(int i =0; i<arr.length;i++) {
//			
//			if(max1 < arr[i]) {
//				
//				max2 = max1;
//				max1 = arr[i];
//				
//			}
//			else if(max2<arr[i]) {
//				
//				 max2 =arr[i];
//			}
//		}
//		System.out.println("First max number is "+ max1);
//		System.out.println("Second max number is "+ max2);
		
		//Print second largest element in array
		Arrays.sort(arr);
		for(int i =0; i<arr.length;i++) {
			
			System.out.println(arr[i]);
			 
		}
		System.out.println("Second Highest number- " + arr[arr.length-2]);
		
		

	}

}
