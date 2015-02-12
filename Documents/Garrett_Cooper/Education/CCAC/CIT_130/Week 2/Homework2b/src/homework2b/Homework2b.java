/**
 * Class: CIT 130  
 * Assignment: Homework 2B
 * Date: 2/10/2015 
 * Author: Garrett Cooper 
 * Program: Federal Tax Calculator
 */

//Program prompts the user to enter their taxable income and 
//the amount of tax paid during the year. The program then outputs if 
//taxes are due, a refund is available, or neither. 
//The program allows processing of multiple clients, and can be terminated
//by typing in a negative value for 'taxable income'. 

package homework2b;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Homework2b {

    public static void main(String[] args) {

        DecimalFormat refundFormat = new DecimalFormat("$#,##0");
        Scanner scan = new Scanner(System.in);

        int count = 0;
        double taxIncome, taxPaid, taxDues;

        System.out.println("Java Homework2b");
        System.out.print("Enter taxable income: ");
        taxIncome = scan.nextInt();

        while (taxIncome >= 0) {

            System.out.print("Enter tax paid during the year: ");
            taxPaid = scan.nextInt();

            if (taxIncome >= 0 && taxIncome < 17851) {
                taxDues = 0.10 * taxIncome - taxPaid;

            } else if (taxIncome >= 17851 && taxIncome < 72501) {
                taxDues = 0.15 * taxIncome - 893 - taxPaid;

            } else if (taxIncome >= 72501 && taxIncome < 146401) {
                taxDues = 0.25 * taxIncome - 8143 - taxPaid;

            } else if (taxIncome >= 146401 && taxIncome < 223051) {
                taxDues = 0.28 * taxIncome - 12535 - taxPaid;

            } else if (taxIncome >= 223051 && taxIncome < 398351) {
                taxDues = 0.33 * taxIncome - 23688 - taxPaid;

            } else if (taxIncome >= 398351 && taxIncome < 450001) {
                taxDues = 0.35 * taxIncome - 31655 - taxPaid;

            } else {
                taxDues = 0.396 * taxIncome - 52355 - taxPaid;
            }

            if (taxDues >=1) {
                System.out.println("\nTax Due is "
                        + refundFormat.format(taxDues) + "\n");

            } else if (taxDues <= -1) {
                System.out.println("\nRefund is "
                        + refundFormat.format(Math.abs(taxDues)) + "\n");

            } else {
                System.out.println("\nNo tax due, no refund\n");
            }

            count++;

            System.out.print("Enter taxable income: ");
            taxIncome = scan.nextInt();
        }
        if (count != 1) {
        System.out.println("\nYou have calculated tax for " + count + " clients\n");
        }
        else {
        System.out.println("\nYou have calculated tax for " + count + " client\n");
        }
    }
}
