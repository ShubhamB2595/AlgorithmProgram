package com.bubblesort;

import java.util.Scanner;

/*
 * class for Bubble sorting operation
 */
public class BubbleSorting {

	//array initialization
	public int myarray[];
	public int arraySize;
	
	//method to take input
	public void takeInput() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array size");
		arraySize = input.nextInt();
		myarray = new int[arraySize]; 
		
		System.out.println("Enter the array elements one by one");
		for(int i=0; i<arraySize; i++) {
			myarray[i] = input.nextInt();
		}
		input.close();
	}
	
	//method to print the given array
	public void print() {
		
		for(int i=0; i<arraySize; i++) {
			System.out.print(myarray[i] + ", ");
		}
	}
	
	//method to sorting in ascending order
	public void sortAsc() {
		
		int temp = 0;
		
	    for (int i = 0; i < arraySize; i++) {
	      for (int j = 1; j < (arraySize - i); j++) {
	        if (myarray[j - 1] > myarray[j]) {
	        	
	          //Code to swap the elements
	          temp = myarray[j - 1];
	          myarray[j - 1] = myarray[j];
	          myarray[j] = temp;
	        }
	      }
	    }
	}
}
