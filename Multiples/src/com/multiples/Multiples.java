package com.multiples;
//import scanner
import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        //create a new scanner
        Scanner input = new Scanner (System.in);
        //ask user for numbers
        System.out.println("Enter your first number:  ");
        int num1 = input.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = input.nextInt();
        //determine if number 1 is a multiple of number 2 and tell the user
       if ((num1 % num2) == 0)
           System.out.println( num1 + " is a multiple of " + num2 );
       else
           System.out.println( num1 + " is not a multiple of " + num2);





    }




}
