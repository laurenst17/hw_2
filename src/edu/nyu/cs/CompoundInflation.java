package edu.nyu.cs;
import java.util.Scanner;



/**
 * This question is inspired by Question 2-13 in Liang's Intro to Java textbook and current economic events.
 * 
 * Complete this program such that it:
 *  - prompts the user to enter an initial amount the user adds to their savings account
 *  - (use the Scanner class's nextLine() function to get user input as a String)
 *  - displays the equivalent value of the account, in today's dollars, after six months of heavy inflation
 *  - (note that today's dollars are worth more than future dollars, since dollars lose their purchasing power each month by the monthly inflation rate)
 *
 * Assume the following:
 *  - a 10% annual inflation rate 
 *  - (i.e. the value of each dollar decreases every month at a monthly rate of 0.10/12 = 0.008333333333333)
 *  - use (int) Math.round(someNumberWithDecimalPlaces) to round all displayed numbers to the nearest dollar... do not output any decimal places.
 *  - assume the user will enter a valid number with or without a decimal place... don't worry about handling any other type of user input
 *  - use System.out.println() to output all text, not System.out.print()
 * 
 * Sample output, including example user input. Your program should format the output exactly like this: 
 *  Please enter your initial savings deposit: 
 *  120
 *  If you save $120 with 10% annual inflation, after 6 months, your account will hold an amount equivalent to $114 today.
 */
public class CompoundInflation {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter your initial savings deposit: ");
        String inital_dep_string = scnr.nextLine();
        double initial_dep = Double.parseDouble(inital_dep_string);
        scnr.close();

        //computation
        double monthly_rate = (1+(.10/12));
        double x_compound = initial_dep/(Math.pow(monthly_rate,6));
        x_compound = (int)Math.round(x_compound);

        int x_compound_r = (int) x_compound;



        System.out.println("If you save $" + inital_dep_string + " with 10% annual inflation, after 6 months, your account will hold an amount equivalent to $" + x_compound_r + " today.");
    
    }
}
