package org.arrays.com;

public class ArrayLeader {
	public static void main(String[] args) {
//		int arr[] ={16,17,4,3,5,2};
//		int num=0;
//		for(int i =0; i< arr.length; i++){
//			
//		 for(int j =i+1; j< arr.length; j++){
//			 
//		  if(arr[i] > arr[j]){
//		   num = arr[i];
//		     System.out.println(num);
//		}
//		else if (arr[i] < arr[j]){
//		    num = arr[j];
//		     System.out.println(num);
//		}
//		}
//		}
		
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		int sum =0;
		for(int i=0; i<arr.length;i++) {
			for(int j=i; j< arr.length;j++) {
				sum = sum+arr[i];
			}
			
		}
		System.out.println(sum);

	}

}
