
package org.arrays.com;

public class EvenOddPositions {


	public static void main(String[] args) {
		
		int arr[] = new int[] {12,56,88,76,90,45};
		int even_pos = arr[0];
		int odd_pos = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(i%2 == 0) {
				
				even_pos = arr[i];
				System.out.println(even_pos +"Even Pos");
			}
			else {
				odd_pos = arr[i];
				System.out.println(odd_pos +"odd Pos");
			}
			
		}
		
//		for(int i=0; i<arr.length; i=i+2) {
//			
//			System.out.println(arr[i]+"Index:"+i);
//			
//		}
//		for(int j=1; j<arr.length; j=j+2) {
//			System.out.println(arr[j]+"Index:"+j);
//		}

	}

}
