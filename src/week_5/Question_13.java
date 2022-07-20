package week_5;

// Write a Java program that takes three numbers as input to calculate and
//        print the average of the numbers.

import java.util.Scanner;

public class Question_13 {

    public static void main(String[] args) { // main method

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scan.nextDouble();

        scan.close();
        System.out.print("The average of entered numbers is:" + avr(num1, num2, num3) );
    }

    public static double avr(double a, double b, double c) // declare local variable
    {
        return (a + b + c) / 3;


    }
}
