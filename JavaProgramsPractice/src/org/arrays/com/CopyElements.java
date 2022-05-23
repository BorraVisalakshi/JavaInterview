package org.arrays.com;

public class CopyElements {

	public static void main(String[] args) {
		
		 int arr1[] = new int[] {1,2,55,78,80};
		 int arr2[] = new int[arr1.length];
		 int value;
		 
		 for(int i = 0; i<arr1.length; i++) {
			 if(arr1[i] < arr1[i+1]) {
				 
				value = arr1[i];
				System.out.println(value);
			 }
			 
//			  arr2[i] = arr1[i];
//			  System.out.println(arr2[i]);
		 }
	}

}
