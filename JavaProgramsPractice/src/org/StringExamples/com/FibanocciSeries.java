package org.StringExamples.com;

import java.util.Scanner;

public class FibanocciSeries {
	
	public static void main(String[] args) {
		
		int num1=0;
		int num2=1;
		int num3;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int count= scan.nextInt();
		System.out.print(num1+" "+num2);
		
		for(int i=2; i<=count;i++) {
			
			num3 = num1+num2;
			System.out.print(" "+num3);    
			num1=num2;
			num2=num3;
			
		}
		scan.close();

	}
	

}






////	System.out.println('j'+'a'+'v'+'a');
//
//if(true) {
//	break;
//	//continue;
//}
//int input1;
//int input2;
//Scanner scan = new Scanner(System.in);
		