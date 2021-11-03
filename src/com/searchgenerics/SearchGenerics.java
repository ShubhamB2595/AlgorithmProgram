package com.searchgenerics;

public class SearchGenerics<T extends Comparable<T>> {
	
	public SearchGenerics() {
		
	}

	//method searching word from the string using binary search approach
	public <T extends Comparable<T>> int binarySearch(T[] array, T word) {
			
		int min = 0;
		int max = array.length - 1;
		int mid;
		
		while (min <= max) {
			mid = (min + max) / 2;
			if(array[mid].compareTo(word) < 0) { 
				min = mid + 1; 
			}
			else if(array[mid].compareTo(word) > 0) {
				max = mid - 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	
	//method searching word from the string using linear search approach
	public <T extends Comparable<T>> int linearSearch(T[] array, T word) {
		
		int max = array.length - 1;
		
		for(int i=0; i<= max; i++) {
			if(array[i].compareTo(word) == 0) {
				return i;
			}
		}
		return -1;
	}
}
