package edu.nyu.cs;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * This question is based on Question 1-10 in Liang's Intro to Java textbook.
 * 
 * Complete this program such that it:
 *  - asks the user how many kilometers they have run
 *  - asks the user how many minutes it took them to run that distance
 *  - displays the average speed of the runner in miles per hour
 * 
 * Here is a sample of what the program should output when run, with example user responses - yours should exactly match this pattern:
 *  How many kilometers did you run?
 *  10
 *  How many minutes did it take you?
 *  30
 *  Your average speed was 12.5 miles per hour.
 */
public class RunningSpeedCalculator {

  /**
   * The main function is automatically called first in a Java program.
   * Write your program logic within this function.
   * Use the Scanner class's nextLine() function to get user input as a String
   * Use the Double.parseDouble() function to covert a String to a double.
   * Do not round any numbers or limit any decimal places in your calculations.
   * Assume 1 mile = 1.609344 kilometers.
   * Use the System.out.println() function for all text output, not System.out.print()
   * 
   * @param args An array of any command-line arguments.  Java requires the main function include this, even if not used.
   * @throws Exception Allows us to not worry about Exceptions in this function. Java requires the main functino include this, even if not used.
   */
  public static void main(String[] args) throws Exception {
        // complete this function to solve the problem

      //figure out kilos
        Scanner scnr = new Scanner(System.in);
        System.out.println("How many kilometers did you run?");
        String kilo_run_string = scnr.nextLine();
        double kilo_run = Double.parseDouble(kilo_run_string);


      //figure out minutes ran
        System.out.println("How many minutes did it take you?");
        String min_run_string = scnr.nextLine();
        double min_ran = Double.parseDouble(min_run_string);

        scnr.close();

      //convert to miles 
        double kilo_rate = 1.609344;
        double mile_ran = kilo_run / kilo_rate ;

      //convert to hours 
      double hours = min_ran / 60;

      //output mph
      double mph = mile_ran / hours;
      BigDecimal mph_big_decimal = new BigDecimal(mph);
      BigDecimal mph_round = mph_big_decimal.setScale(2, RoundingMode.HALF_UP);



      System.out.println("Your average speed was " + mph_round + " miles per hour.");






  }


}
