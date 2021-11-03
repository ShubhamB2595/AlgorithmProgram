package com.searchgenerics;

import java.util.Arrays;

public class SortMain {

	public static void main(String[] args) {

		Integer[] intArr = {47, 85, 62, 34, 7, 10, 92, 106, 2, 54};
		
		SortGenerics<String> sort = new SortGenerics<String>();
		sort.bubbleSort(intArr);

		System.out.println("Array after sorting:");
		System.out.println(Arrays.toString(intArr));

	}

}
