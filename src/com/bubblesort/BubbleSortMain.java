package com.bubblesort;
/*
 * main class
 */
public class BubbleSortMain {

	public static void main(String[] args) {
		
		//calling the bubble sorting method
		BubbleSorting sort = new BubbleSorting();
		
		System.out.println("Taking inputs");
		sort.takeInput();
		
		System.out.println("Array element before sorting:");
		sort.print();

		System.out.println("");
		
		sort.sortAsc();
		System.out.println("Array element after sorting:");
		sort.print();
	}

}
