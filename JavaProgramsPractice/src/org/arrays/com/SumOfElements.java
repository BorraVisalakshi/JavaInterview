package org.arrays.com;

public class SumOfElements {
	public static void main(String[] args) {
		
		int arr[] = {1,8,9,3,0,6,7,-1};
		int sum =0;
		
		for(int i =0; i<arr.length; i++) {
			
			sum = sum+arr[i];
		}
		System.out.println(sum);
	}

}
