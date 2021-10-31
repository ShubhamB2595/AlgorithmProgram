package com.anagram;
/*
 * main class
 */
import java.util.Scanner;

public class AnagramMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        
        // Getting the input string from the user
        System.out.print("Enter the First String : ");
        String s1 = input.nextLine();
         
        System.out.print("Enter the second String : ");
        String s2 = input.nextLine();
        
        //calling the anagram checker method
        AnagramChecker anagram = new AnagramChecker();
        
        if(anagram.checkAnagram(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are Anagrams");
        }
        else {
            System.out.println(s1 + " and " + s2 + " are NOT Anagrams");
        }
        
        input.close();
	}
}
