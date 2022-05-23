package org.arrays.com;

public class CheckArraySort {
	
	public static void main(String[] args) {
		
		int arr[] = {12,2,95,68,80};
		System.out.println(isSorted(arr));
	
	}
	public static boolean isSorted(int[] arr)
    {
        if (arr == null || arr.length <= 1) {
            return true;
        }
 
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
 
        return true;
    }
 

}
