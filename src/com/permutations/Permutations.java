/*
 * main function class for permutations of string
 */
package com.permutations;

public class Permutations {

	public static void main(String[] args) {
		
		//calling iterative method
		System.out.println("Permuatation using Iterative method");
		Iterative find = new Iterative();
		
		find.permutation("ABC");

		System.out.println("");
		
		//calling recursive method
		System.out.println("Permuatation using Recursive method");
		Recursive permute = new Recursive();
		
		permute.permutation("ABC");
	}

}
