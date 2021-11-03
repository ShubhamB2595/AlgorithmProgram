package com.guess;
/*
 * main class to guessing the number 
 */
import java.util.Scanner;

public class GuessMain {

	public static void main(String[] args) {

		GuessingNumber guess = new GuessingNumber();
		
		System.out.println("Enter any number between 1 to 10:");
		Scanner input=new Scanner (System.in);
		int k = input.nextInt();
		
	    int n = (int) Math.pow(2, k);
	    
	    System.out.println("Think of an integer between "+ 0 +  " to " + (n-1));
	    
	    int secret = guess.guessing(0, n);
	    System.out.println("Your number is %d\n"+ secret);
	    
	    input.close();

	}

}
