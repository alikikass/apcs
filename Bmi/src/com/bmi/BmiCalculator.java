package com.bmi;
//import scanner
import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        //create new scanner
        Scanner input = new Scanner (System.in);
        //ask user for height and weight
        System.out.println("Enter your height in inches: ");
        int height = input.nextInt();
        System.out.println("Enter your weight in pounds: ");
        int weight = input.nextInt();
        //make BMI a variable
        int bmi = (weight * 703) / (height * height);
        //calculate BMI
        System.out.println("Your BMI is " + bmi );
        //print out information from Department of Health and Human Services
        System.out.println("\nBMI VALUES:" + "\nUnderweight: less than 18.5" + "\nNormal: between 18.5 and 24.9"
                + "\nOverweight: between 25 and 29.9" + "\nObese: 30 or greater");
        //tell user what their BMI is


    }
}
