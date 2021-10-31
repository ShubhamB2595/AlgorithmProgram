/*
 * Iterative class to generate all permutations of a string
 */
package com.permutations;

import java.util.ArrayList;
import java.util.List;

public class Iterative {

	//constructor
	public Iterative() {
		
	}
	
	// method for string permutations using iterative approach
	public void permutation(String input) {
		
        if (input.isEmpty()) {
        	
        	System.out.println("Please enter something");
            return;
        } // if string is null it will return from this only
 
        List<String> partial = new ArrayList<>();
 
        partial.add(String.valueOf(input.charAt(0)));
 
        for (int i = 1; i < input.length(); i++) {
        	
            for (int j = partial.size() - 1; j >= 0 ; j--) {
                String s = partial.remove(j);
 
                for (int k = 0; k <= s.length(); k++) {
                	partial.add(s.substring(0, k) + input.charAt(i) + s.substring(k));
                }
            }
        }
        // printing the permutations 
        System.out.println(partial);
    }
}
