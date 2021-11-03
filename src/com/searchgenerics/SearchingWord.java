package com.searchgenerics;
/*
 * main class
 */
public class SearchingWord {

	public static void main(String[] args) {
		
		//Initialization string array and word to 
		String[] strArr = { "AAA", "BBB", "CCC", "DDD", "EEE", "FFF", "GGG" };
		String word = "EEE";
		
		//calling method for searching word
		SearchGenerics<String> search = new SearchGenerics<String>();
		System.out.println("Word " + word + " Found at: " + search.binarySearch(strArr, word) + " position");
			
	}

}
