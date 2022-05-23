package org.arrays.com;

public class ArraysLoop {

	public static void main(String[] args) {
		
		int arr[] = {2,22,56,88};
		System.out.println("Looping arrays");
		
		for(int i = 0; i< arr.length; i++) {
			
			System.out.println("Looped elements are-" + arr[i]);
			
		}
		for(int a: arr) {
			 System.out.println("Looping using for-each loop- " + a);
		}
	}

}
