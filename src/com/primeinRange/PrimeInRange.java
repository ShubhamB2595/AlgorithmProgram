package com.primeinRange;
/*
 * Java program to print prime numbers in a given range
 */

public class PrimeInRange {

	public static void main(String[] args) {

		getPrime();
	}
	
	//finding and printing all prime numbers between given range
	public static void getPrime() {
		
		//variables
		int start = 0;
		int end = 1000;
		
		System.out.println("Prime numbers between " + start + " and " + end + " are: ");
		
		int count;
		
		for(int i = start; i <= end; i++) {
			//logic for checking number is prime or not
			count = 0;
			for(int j = 1; j <= i; j++)	{
				if(i % j == 0)
					count = count + 1;
			}
			if(count == 2) {
				System.out.println(i);
			}
		}	
	}
	
}

