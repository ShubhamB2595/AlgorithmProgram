package com.guess;

import java.util.Scanner;

/*
 * class is to guess the number guess by user
 */
public class GuessingNumber {
	
	//guessing the number by taking inputs form the user
	/*
	 * recursively ask true/false if the number is between
	 * a high and low value
	 */
	public int guessing(int low, int high) {
		
		if(high - low == 1) {
			return low;
		}
		
		int mid = low + (high - low) / 2;
		System.out.println("It is less than: " + mid + "(True or False)");
		
		Scanner scan = new Scanner(System.in);
		boolean answer = scan.nextBoolean();
	
		if(answer) {
			return guessing(low, mid);
		}
		else {
			return guessing(mid, high);
		}
		
	}

	//Constructor
	public GuessingNumber() {
		
	}
}
