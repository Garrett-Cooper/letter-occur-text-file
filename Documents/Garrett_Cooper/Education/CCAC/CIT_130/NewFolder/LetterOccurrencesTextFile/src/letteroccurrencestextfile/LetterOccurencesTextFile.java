/**
 * Class: CIT 130  
 * Assignment: Homework 4A
 * Date: 3/15/2015 
 * Author: Garrett Cooper 
 * Program: Letter Occurrences in a Text File [4A] Program
 */

//The program counts the number of occurences of a given letter in a text file.
//It counts not only the total number of occurences, but also the number of its
//lower-case and upper-case occurences.

//The program achieves the above results by asking the user to input a letter
//and the path and name of a text file. Where the file name is a string, 
//the length of which is between 1 and 60. The file contains 1 and 1,000 lines,
//each of which is between 1 and 60 characters long. The characters in the file 
//may include letters, digits, and punctuation marks. The file does not include
//spaces, and it also does not include blank lines. 

package letteroccurrencestextfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LetterOccurencesTextFile {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        
        // Please enter the path of the text file; for example: 
        // "//Users/garrettcooper/Desktop/input.txt"
        System.out.print("Enter name of the directory path and input file: ");
            String filePath = scan.nextLine();
        
        FileInputStream input = new FileInputStream(filePath);  
        InputStreamReader reader = new InputStreamReader(input);
                int data = reader.read();

        System.out.print("Please enter a character: ");
            String str = scan.next();
            
            String strUp = str.toUpperCase();
                char strCharUp = strUp.charAt(0);
        
            String strLo = str.toLowerCase();
                char strCharLo = strLo.charAt(0);

        int counterCharLo = 0;
        int counterCharUp = 0;

        while (data != -1) {

            char ch = (char) data;
            
            if (ch == strCharLo) {
                counterCharLo++;
            }
            
            if (ch == strCharUp) {
                counterCharUp++;
            }
            
            data = reader.read();
        }

        System.out.println("\nThe lower-case letter \"" + strCharLo 
                + "\" occurs " + counterCharLo + " times");
        
        System.out.println("The upper-case letter \"" + strCharUp 
                + "\" occurs " + counterCharUp + " times");
        
        System.out.println("The total number of occurences (\"" + strCharLo 
                + "\" and \"" + strCharUp + "\") is " 
                + (counterCharLo + counterCharUp)+"\n");
    
    } // main
} // class
