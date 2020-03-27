package com.multiples;
//import scanner
import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        //create a new scanner
        Scanner input = new Scanner (System.in);

        System.out.println("Enter '0' to start and '-1' to quit: ");
        int i = input.nextInt();
        while(i != -1) {
            //ask user for numbers
            System.out.println("Enter your first number :  ");
            int num1 = input.nextInt();
            System.out.println("Enter your second number: ");
            int num2 = input.nextInt();
            //determine if number 1 is a multiple of number 2 and tell the user
            if ((num1 % num2) == 0)
                System.out.println(num1 + " is a multiple of " + num2);
            else
                System.out.println(num1 + " is not a multiple of " + num2);

            System.out.println("Enter '0' to start and '-1' to quit: ");
             i = input.nextInt();
             }



    }




}
