/*
 *CIT 111 Intro to Programming
 *First Java Program
 *09/28/2014
 *Author:  Garrett Gcooper
 *Probable Seasons
*/

package chapter.pkg5.hw;

import java.util.Scanner;

public class Chapter5HW {

    public static void main(String[] args) {
        
        //Define scanner class to receive temperature input from the user.
        
        Scanner scan = new Scanner(System.in);

         
        //Define an integer variable, "temp" (for temperature) to hold user values.
        
        int temp;
        
        //Print out program author and program information for the user.
        
        System.out.println("CIT111 Fall 2014 Assignment 3"); 
        System.out.println("Garrett Cooper"); 
        System.out.println("Probable Seasons"); 
            
        //Ask the user to enter a temperature value    
        System.out.print("\nPlease enter a temperature (as a whole number): ");
            temp = scan.nextInt();
        
        //If temperature is less than -5 or greater than 110, program will 
        //instruct user that the value they have defined is outside the valid
        //range of the program.
            
        if (temp < -5 || temp > 110)
            {
            System.out.println("\nThe temperature you entered, " + temp
                    + ", is outside the valid range.\n");
            System.exit(0);
            }
        //Program determines it is likely the summer month if the user passes it 
        //a value greater than or equal to 90 degrees, yet less than or equal to 
        //110 degrees.
            
            else if  (temp >= 90) 
            
            {
                System.out.println("\nThe temperature you entered is " + temp + 
                        ", so you are probably in the summer season.\n");
            } 

        //Program determines it is likely the spring month if the user passes it 
        //a value greater than or equal to 70 degrees, yet less than 90 degrees.
    
            else if (temp >= 70)
            
            {
                System.out.println("\nThe temperature you entered is " + temp + 
                        ", so you are probably in the spring season.\n");    
            }       
            
        //Program determines it is likely the fall month if the user passes it 
        //a value greater than or equal to 50 degrees, yet less than 70 degrees.
            
            else if (temp >= 50)
            
            {
                System.out.println("\nThe temperature you entered is " + temp + 
                        ", so you are probably in the fall season.\n");
            }      
            
        //Program determines it is likely the winter month if the user passes it 
        //a value greater than 50 degrees.
        
        else
            
            {
                System.out.println("\nThe temperature you entered is " + temp + 
                        ", so you are probably in the winter season.\n");    
            }  
    
        //Closing comments of the program - thanks the user for using the 
        //program and points out they probably already know the answer.
        
        System.out.println("Thank you for using the Probable Seasons "
                + "application to figure out what you"
                + "\nalready know by looking at your calendar.\n");
        
    }
    
}
