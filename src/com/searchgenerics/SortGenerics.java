package com.searchgenerics;

public class SortGenerics<T extends Comparable <T>> {
	
	public <T extends Comparable <T>> void bubbleSort(T[] array) {
		
		int arraySize = array.length;
		T temp;
			
		for (int i = 0; i < arraySize; i++) {
			for (int j = 1; j < (arraySize - i); j++) {
				if (array[j-1].compareTo(array[j]) > 0) {
		        	
		          //Code to swap the elements
		          temp = array[j - 1];
		          array[j - 1] = array[j];
		          array[j] = temp;
		        }
		    }
		}
	}
	
	public SortGenerics() {
		
	}

	@Override
	public String toString() {
		return "SortGenerics [toString()=" + super.toString() + "]";
	}

}
