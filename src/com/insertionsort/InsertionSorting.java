package com.insertionsort;
/*
 * class for insertion sorting of string
 */
public class InsertionSorting {

	//method for insertion operation
	public void insertionSort(String[] strArr) {	
		
		for (int i = 0; i < strArr.length-1; i++) {
			
            for (int j = i + 1; j > 0; j--) {
            	
                if (strArr[j].compareTo(strArr[j - 1]) < 0) {
                    String temp = strArr[j];
                    strArr[j] = strArr[j - 1];
                    strArr[j - 1] = temp;
                }
            }
        }
	}
	
	void printString(String[] str) {
		
	    for (int i=0; i<str.length; i++) {
	        System.out.print(str[i]+" ");
	    }
	}
	
	//constructor
	public InsertionSorting() {
		
	}
}
