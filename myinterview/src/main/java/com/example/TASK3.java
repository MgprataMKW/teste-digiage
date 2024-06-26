package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*
 * Write a list and add an aleatory number of Strings. In the end, print out how
 * many distinct itens exists on the list.
 *
 */

public class TASK3 {
	
	// Main Function
	public static void main(String[] args) {
		
        // Creating new list to storage the strings
		List<String> stringList = new ArrayList<String>();
        
        // Adding random quantity of strings to be added in the list (between three and nine)
        Random random = new Random();
        int numStrings = random.nextInt(7) + 3;
        
        // Adding random strings to the list
        for (int i = 0; i < numStrings; i++) {
            
        	// Generating a random string 
            String randomString = generateRandomString(random);
            stringList.add(randomString);
        }
        
        // Printing the list of strings
        System.out.println("Lista de strings:");
        for (String s : stringList) {
            System.out.println(s);
        }

        // Obtaining distincts itens
        Set<String> distinctStrings = new HashSet<String>(stringList);
        
        // Printing the quantity of distincts itens exists in the list
        System.out.println("Número de itens distintos na lista: " + distinctStrings.size());
    }
    
    // Function to generate a random string
    private static String generateRandomString(Random random) {
    	
        // Defining random string size (between three and nine characters)
        int length = random.nextInt(7) + 3;
        StringBuilder sb = new StringBuilder(length);
        
         // Generating random alphabetic strings
        for (int i = 0; i < length; i++) {
            char c = (char) (random.nextInt(26) + 'a'); // Caracteres de 'a' a 'z'
            sb.append(c);
        }
        
        return sb.toString();
    }
}