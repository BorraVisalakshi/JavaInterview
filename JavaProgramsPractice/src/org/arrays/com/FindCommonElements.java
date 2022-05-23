package org.arrays.com;

public class FindCommonElements {
	
	public static void main(String[] args) {
		
		 int arr1[] = new int[] {1,2,4,55,68,90};
		 int arr2[] = new int[] {12,68,90,55,88,34};
		 
		 for(int i=0; i<arr1.length; i++) {
			 
			 for(int j=0; j<arr2.length; j++) {
				 
				 if(arr1[i] == arr2 [j]) {
					 
					 System.out.println("Common elements-" +arr1[i]);
					// break;
				 }
			 }
			 
		 }
	}

}
