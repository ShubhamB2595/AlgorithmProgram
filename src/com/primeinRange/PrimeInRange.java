package com.primeinRange;
/*
 * Java program to print prime numbers in a given range
 */

public class PrimeInRange {

	public static void main(String[] args) {

		getPrime();
	}
	
	//finding and printing all prime numbers between given range
	public static void getPrime() {
		
		//variables
		int start = 0;
		int end = 1000;
		
		System.out.println("Prime numbers between " + start + " and " + end + " are: ");
		
		int count;
		
		for(int i = start; i <= end; i++) {
			//logic for checking number is prime or not
			count = 0;
			for(int j = 1; j <= i; j++)	{
				if(i % j == 0)
					count = count + 1;
			}
			if(count == 2) {
				//System.out.println(i);
				checkPalin(i);
			}
		}	
	}

	//method for the use in anagram operation
	static void updateFreq(int n, int [] freq) {
        while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }
    }

	//method to check the anagram of two int values
    static boolean areAnagrams(int a, int b) {
        int [] freqA = new int[10];
        int [] freqB = new int[10];

        updateFreq(a, freqA);
        updateFreq(b, freqB);

        for (int i = 0; i < 10; i++) {
            if (freqA[i] != freqB[i])
                return false;
        }
        return true;
    }
	
    //method to checking number is palindrome or not
    public static void checkPalin(int num) {
    	
    	int rem, sum = 0;
    	int temp = num; 
    	
    	while(num > 0) {  
            rem = num % 10;   
            sum = sum * 10 + rem;   
  
            num = num / 10;   
        }  
    	if(sum == temp) {
    		System.out.println("Prime number: " + temp + " is Palindrome");
    	}
    	else {
    		System.out.println("Prime number: " + temp + " is Not Palindrome");
    	}
    }
    
}

