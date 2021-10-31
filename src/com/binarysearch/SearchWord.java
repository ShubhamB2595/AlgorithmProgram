package com.binarysearch;

public class SearchWord {

	public static void main(String[] args) {

		//Initialization string array and word to 
		String[] strArr = { "AAA", "BBB", "CCC", "DDD", "EEE", "FFF", "GGG" };
		String word = "CCC";
		
		//calling method for searching word
		BinarySearch search = new BinarySearch();
		System.out.println("Word " + word + " Found at: " + search.stringBinarySearch(strArr, word) + " position");
	}

}
