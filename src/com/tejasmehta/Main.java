/****
 * Name: Tejas Mehta
 * Code Project: GCI Task - Decimal to Binary
 * Date Written: Monday, December 2nd, 2019
 */
package com.tejasmehta;

import java.util.Scanner;
import java.util.Set;

public class Main {

    //Main runner
    public static void main(String[] args) {
        //Get a number in decimal from the user via a made method
        int numberToConvert = getDecimalNum();
        System.out.println(numberToConvert + " in binary is: " + convertToBinary(numberToConvert));

    }
    //Method to get the user's entry
    static int getDecimalNum() {
        //declare a variable and scanner
        int userNumber;
        Scanner in = new Scanner(System.in);
        //Ask to enter a number
        System.out.println("Enter a whole number: ");
        while (true) {
            //Check that the next entry is an integer, if not prompt them to enter a number again
            if (in.hasNextInt()) {
                userNumber = in.nextInt();
                break;
            } else {
                System.out.println("Please enter a whole number: ");
            }
        }
        //return the number
        return userNumber;
    }
    //method to convert number to binary
    static int convertToBinary(int decimalNum) {
        //Stringbuilder for the number as we will be modifying and appending to it, and reversing it at the end
        StringBuilder backwardsNumber = new StringBuilder();
        //Do-While loop to ensure that at least one round has been done of division
        do {
            //Append the remainder to the backwards number
            backwardsNumber.append(decimalNum % 2);
            //divide decimalNum by 2
            decimalNum /= 2;
        } while (decimalNum != 0);
        //Return the integer value of backwardsNumber reversed (which is the binary value)
        return Integer.parseInt(backwardsNumber.reverse().toString());
    }
}
