package com.binarysearch;
/*
 * class for searching word from string array using binary approach
 */
public class BinarySearch {

	//constructor
	public BinarySearch() {
		
	}
	
	//method searching word from the string
	public int stringBinarySearch(String[] strArr, String word) {
		
		int min = 0;
		int max = strArr.length - 1;
		int mid;
		
		while (min <= max) {
			mid = (min + max) / 2;
			if(strArr[mid].compareTo(word) < 0) { 
				min = mid + 1; 
			}
			else if(strArr[mid].compareTo(word) > 0) {
				max = mid - 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
}
