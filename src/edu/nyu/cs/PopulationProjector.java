package edu.nyu.cs;

import java.util.Scanner;

/**
 * This question is based on Question 1-11 in Liang's Intro to Java textbook.
 * 
 * Complete this program such that it:
 *  - calculates and displays the projected population at the end of each of year from 2023 to 2027.
 *
 * The U.S. Census Bureau projects population based on the following assumptions:
 *  - Population at the start of 2023: 332,403,650
 *  - Each year has 365 days
 *  - One birth every 7 seconds
 *  - One death every 13 seconds
 *  - One new immigrant every 45 seconds
 * 
 * Hint:
 *  - There are no fractional people.  All population projections must be integers.
 *  - In Java, if two integers perform division, the result is an integer - the fractional part is truncated.  
 *  - To get an accurate result, one of the values in the division must be a number with a decimal place.
 *  - use System.out.println() to output all text, not System.out.print()
 * 
 * Sample output. Your program should format the output exactly like this: 
 *  Here are the projected population numbers for the next five years:
 *  - Year 2023: 333,505,890
 *  - Year 2024: 345678825 
 *  - Year 2025: 358766234 
 *  - Year 2026: 365805245 
 *  - Year 2027: 373925136 
 */
public class PopulationProjector {

    /**
     * The main function is automatically called first in a Java program.
     * Complete the assignment within this function.
     * 
     * @param args An array of any command-line arguments.  Java requires the main function include this, even if not used.
     * @throws Exception Allows us to not worry about Exceptions in this function. Java requires the main functino include this, even if not used.
     */
    public static void main(String[] args) throws Exception {
        // complete this function to solve the problem


        double birth_rate = 7.0;
        double death_rate = 13.0;
        double immigrant_rate = 45.0;
        int current_pop = 332403650;
        int second_in_year = 365 * 24 * 60 * 60; //31,536,000    

        // difference = 1,102,240


    
        double num_births = second_in_year / birth_rate; //4,505,142
        double num_deaths = second_in_year / death_rate; //2,425,846
        double num_immigrant = second_in_year / immigrant_rate; //700,800


        System.out.println("Here are the projected population numbers for the next five years:");

        
        for(int y = 2023; y<=2027; y++) {
            current_pop += (num_births + num_immigrant - num_deaths);
            System.out.println("- Year "+y+": "+current_pop);

        }


    }


}
