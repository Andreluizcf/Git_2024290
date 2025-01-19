/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author dange
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Andre - 2024290");
        
                Scanner scan = new Scanner(System.in);
        String name;

        System.out.print("Enter your name (letters only): "); // Ask for an input

        while (true) {
            name = scan.nextLine();

            if (name.matches("[a-zA-Z]+")) { // Check if the input contains only letters
                break; // Valid input, exit the loop
            } else { // Error message, the input didn't contain only letters
                System.out.println("The name should only contain letters. Please, try again: ");
            }
        }

        name = name.trim(); // Exclude any "blank space" that might have before and after the input

        String upperCaseName = name.toUpperCase(); // Convert name to uppercase letter

        String lowerCaseName = name.toLowerCase(); // Convert name to lowercase letter

        if (name.matches("[a-z]+")) { // The name have only lowercase, so I will output only the uppercase change

            System.out.println("That is your name changed to uppercase letters: " + upperCaseName);
        } else if (name.matches("[A-Z]+")) { // The name have only uppercase, so I will output only the lowercase change

            System.out.println("That is your name changed to lowercase letters: " + lowerCaseName);
        } else {  // The name is mixed with lowercase and uppercase, so I will output both chnages
            System.out.println("That is your name changed to uppercase letters: " + upperCaseName);
            System.out.println("That is your name changed to lowercase letters: " + lowerCaseName);
        }

        
        
    }
    
}
