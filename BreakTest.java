package com.controlstructures;

public class BreakTest {

	public static void main(String[] args) {
		int count = 0;
		for(int i=1; i<=100; i++) {
			if(i==1) {
				continue;
			}else if(i==2){
				count++;
				System.out.println(count + " : " + i);
			}else {
				boolean isPrime = true;
				for(int j=2;j<i; j++) {
					if(i%j == 0) {
						isPrime = false;
						break;
					}
				}		
				if(isPrime) {
					count++;
					System.out.println(count + " : " + i);
				}	
			}	
		}
	}
}
