package org.arrays.com;

import java.util.Scanner;

public class FibanocciSeries {
	public static void main(String[] args) {
		int num1 =0, num2=1;
		int num3;
		int count;
		
		Scanner scan = new Scanner(System.in);
		count = scan.nextInt();
		System.out.println(num1+" "+num2);
		for(int i=2; i<=count; i++) {
			num3 =num1+num2;
			System.out.println(num3+" ");
			num1=num2;
			num2=num3;
			
		}
//		if(3*0.1 == 0.3) {
//			
//		}
//		else {
//			System.out.println("fasle");
//		}
		
	}
	

}
