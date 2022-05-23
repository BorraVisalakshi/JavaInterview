package org.arrays.com;

public class ReverseIntegerArray {
	
	public static void main(String[] args) {
		
		Integer[] input = new Integer[]{1,2,3,4,5,6,7,8,9};
		
		for(int i=input.length-1; i>=0; i--) {
			System.out.println(input[i]);
		}
	}
}
