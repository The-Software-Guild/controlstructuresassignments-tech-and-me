package controlstructure;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number below :");
		String numStr = sc.nextLine();
		String numStrReverse = "";
		int len = numStr.length();
		for(int i=len-1; i>=0; i--) {
			numStrReverse += numStr.charAt(i);
		}
		if(numStr.equals(numStrReverse)) {
			System.out.println("The given number is a palindrome.");
		}else {
			System.out.println("The given number is not a palindrome.");
		}
		
		sc.close();
	}

}
