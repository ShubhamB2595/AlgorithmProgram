package com.insertionsort;

public class Main {

	public static void main(String[] args) {
		
		String[] str = { "ABC", "XYZ", "BCD"};
		
		System.out.println("Array string before: ");
		for(int i = 0; i<str.length; i++) {
		
			System.out.print(str[i] + " ");
			} 
		
		System.out.println("");
		
		//calling the insertion method
		InsertionSorting sort = new InsertionSorting();
		
		sort.insertionSort(str);
		
		System.out.println("Array string after insertion sorting: ");
		sort.printString(str);
	}

}
