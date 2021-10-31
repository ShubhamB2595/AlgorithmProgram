package com.mergesort;

import java.util.Arrays;

/*
 * main class
 */
public class MergeSortMain {

	public static void main(String[] args) {
		
		//array declaration
		int[] intArray = { 12, 2, 34, 11, 4 };
		int length = intArray.length;
		
		System.out.println("Array before sorting: " + Arrays.toString(intArray));
		
		//calling the merge sorting
		MergeSort merge = new MergeSort();
		
		merge.mergeSort(intArray, 0, length-1);
		System.out.println("Array after sorting: " + Arrays.toString(intArray));
	}
}
