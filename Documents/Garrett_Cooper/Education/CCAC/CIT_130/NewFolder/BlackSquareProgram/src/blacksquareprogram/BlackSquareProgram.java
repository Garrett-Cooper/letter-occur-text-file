/**
 * Class: CIT 130  
 * Assignment: Homework 3B
 * Date: 2/21/2015 
 * Author: Garrett Cooper 
 * Program: Black Square 3B Program
 */

//This program inputs two integers, m and n, and draws m^2 squares, 
//each of the size n x n, arranged in an m x m table. That is, the program 
//draws a table with m rows and m columns, each element of which is an n x n
//square. Also, it should be noted that the perimeter of each square is 
//composed of the symbol '*', and the space is filled with the symbol 'o'. 
//Lastly, the program prompts the user to enter two integers between 2 and 8
//for both m and n inputs.  

package blacksquareprogram;

import java.util.Scanner;

public class BlackSquareProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter two integers between 2 and 8 for"
                + " the following: \n");

        System.out.print("Enter table size > ");
        int tableDim = scan.nextInt();

        while (tableDim < 2 || tableDim > 8) {
            System.out.print("Incorrect value. Please try again.\n");
            System.out.print("\nEnter table size > ");
            tableDim = scan.nextInt();
        }

        System.out.print("Enter square size > ");
        int squareDim = scan.nextInt();
        while (squareDim < 2 || squareDim > 8) {
            System.out.print("Incorrect value. Please try again.\n");
            System.out.print("\nEnter square size > ");
            squareDim = scan.nextInt();
        }

        System.out.println();

        for (int tblRow = 0; tblRow < tableDim; tblRow++) {

            for (int row = 0; row < squareDim; row++) {

                for (int tblCol = 0; tblCol < tableDim; tblCol++) {

                    for (int col = 0; col < squareDim; col++) {

                        if (row == 0 || row == (squareDim - 1)) {
                            System.out.print('*');

                        } else {

                            if (col == 0 || col == (squareDim - 1)) {
                                System.out.print('*');

                            } else {
                                System.out.print('o');

                            }
                        }
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
