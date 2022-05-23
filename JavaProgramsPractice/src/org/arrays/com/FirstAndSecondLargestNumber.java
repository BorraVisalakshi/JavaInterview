package org.arrays.com;

public class FirstAndSecondLargestNumber {

	public static void main(String[] args) {
		
		int arr[] = new int[] {45,34,76,88,12,96};
		int max1 = arr[0];
		int max2 = arr[0];
		//int max3 = arr[0];
		
		for(int i =0; i<arr.length; i++) {
			
			if (max1< arr[i]) {
				//max3 = max2;
				max2 =max1;
				max1=arr[i];
				
				
			}
			else if(max2<arr[i]) {
				//max3=max2;
				max2 = arr[i];
			}
//			else if(max3<arr[i]) {
//				max3=arr[i];
//			}
//			
		}
		System.out.println(max1+"Max 1st");
		System.out.println(max2+ "Max 2nd");
		//System.out.println(max3+ "Max 3nd");

	}

}
