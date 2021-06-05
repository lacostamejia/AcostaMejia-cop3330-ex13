/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 *
 *
 * What is the principal amount? 1500
What is the rate? 4.3
What is the number of years? 6
What is the number of times the interest is compounded per year? 4
$1500 invested at 4.3% for 6 years compounded 4 times per year is $1938.84.
*
* Prompt for the rate as a percentage (like 15, not .15). Divide the input by 100 in your program.
Ensure that fractions of a cent are rounded up to the next penny.
Ensure that the output is formatted as money.
*
* A = P(1 + r/n)^(n*t) where
 */

import java.util.*;
import java.lang.Math;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //Scanner method declared

        int principal;
        double rate;
        int years;
        int num_compounded;

        System.out.print("What is the principal amount? ");
        principal = in.nextInt();

        System.out.print("What is the rate? ");
        rate = in.nextDouble(); //Here we are scanning in percentage

        double rate_change = ((rate)/100);

        System.out.print("What is the number of years? ");
        years = in.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        num_compounded = in.nextInt();

        double first_half = (principal * (1 + (rate_change/num_compounded)));
        double second_half = num_compounded * years;

        double interest = Math.pow(first_half, second_half); //Here we are calculating the interest in that period of time.

        System.out.println("$" + principal + " invested at " + rate + "% for " + years + " years compounded " + num_compounded + " times per year is $" + interest + ".");

    }
}
