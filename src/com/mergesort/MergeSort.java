package com.mergesort;
/*
 * class for sorting data using merge sort
 */
public class MergeSort {
	
	// method to sorting data using merge sort
	void merge(int a[], int beg, int mid, int end) {    
		
		//declaration
	    int i, j, k;  
	    int n1 = mid - beg + 1;    
	    int n2 = end - mid;    
	    
	    //temporary array for splitting from middle
	    int LeftArray[] = new int[n1];  
	    int RightArray[] = new int[n2];  
	     
	    for (i = 0; i < n1; i++)    
	    LeftArray[i] = a[beg + i];  
	    
	    for (j = 0; j < n2; j++)    
	    RightArray[j] = a[mid + 1 + j];    
	      
	    i = 0;  
	    j = 0;  
	    k = beg; 
	      
	    while (i < n1 && j < n2) {   
	    	
	        if(LeftArray[i] <= RightArray[j]) {    
	            a[k] = LeftArray[i];    
	            i++;    
	        }    
	        else {    
	            a[k] = RightArray[j];    
	            j++;    
	        }    
	        k++;    
	    }
	    
	    while (i<n1) {    
	        a[k] = LeftArray[i];    
	        i++;    
	        k++;    
	    }    
	      
	    while (j<n2) {    
	        a[k] = RightArray[j];    
	        j++;    
	        k++;    
	    }    
	}    
	 
	//method to merging the data
	void mergeSort(int a[], int beg, int end) {  
	    if (beg < end) {  
	    	
	        int mid = (beg + end) / 2;  
	        mergeSort(a, beg, mid);  
	        mergeSort(a, mid + 1, end);  
	        merge(a, beg, mid, end);  
	    }  
	}  
	  
    
    //constructor
    public MergeSort() {
    	
    }

}
