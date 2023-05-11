package com.controlstructures;

import java.util.Scanner;

public class ForLoopTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		String numStr = sc.nextLine();
		int num = Integer.parseInt(numStr);
		if(num == 0) {
			System.out.println("Factorial of" + num + " is 1");
		}else if(num < 0) {
			System.out.println("Factorial of any negative number is not defined");
		}else {
			long result = 1L;
			for(int i=num; i>=1; i--) {
				result *= i;
			}
			System.out.println("Factorial of " + num + " is : " + result);
		}	
	}
}
