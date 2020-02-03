package com.leapyear;
//import scanner
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //create new scanner
        Scanner input = new Scanner(System.in);
        //ask user for years
        System.out.println("Please enter a year: ");
        int year1 = input.nextInt();
        System.out.println("Please enter another year: ");
        int year2 = input.nextInt();
        System.out.println("Please enter your third year: ");
        int year3 = input.nextInt();

        //do calculations for first year
        if (year1 % 4 == 0)
            if (year1 % 100 == 0)
                if (year1 % 400 == 0)
                    System.out.println(year1 + " is a leap year");
                else
                    System.out.println(year1 + " is not a leap year");
            else
                System.out.println( year1 + " is a leap year");
        else
            System.out.println( year1 + " is not a leap year");

        //do calculations for second year
        if (year2 % 4 == 0)
            if (year2 % 100 == 0)
                if (year2 % 400 == 0)
                    System.out.println(year2 + " is a leap year");
                else
                    System.out.println(year2 + " is not a leap year");
            else
                System.out.println( year2 + " is a leap year");
        else
            System.out.println( year2 + " is not a leap year");

        //calculations for third year
        if (year3 % 4 == 0)
            if (year3 % 100 == 0)
                if (year3 % 400 == 0)
                    System.out.println(year3 + " is a leap year");
                else
                    System.out.println(year3 + " is not a leap year");
            else
                System.out.println( year3 + " is a leap year");
        else
            System.out.println( year3 + " is not a leap year");


    }
}
