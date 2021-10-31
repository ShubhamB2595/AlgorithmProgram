package com.permutations;
/*
 * Recursive class to generate all permutations of a string
 */
public class Recursive {
	
	//Constructor
	Recursive() {
		
	}
	
	// method to calling from main method 
	 public void permutation(String input){
         permute(input, "");
         
	 }

	// method for string permutations using recursive approach
	private static void permute(String input, String start) {
		if (input.length() == 0) {
			System.out.print(start + "  ");
			return;
		}
		     
		for(int i = 0 ;i < input.length(); i++) {
	        char ch = input.charAt(i);
	        String left_substr = input.substring(0, i);
	        String right_substr = input.substring(i + 1);
	        String rest = left_substr + right_substr;
	        permute(rest, start + ch);
	    }
	}
}

		
	
