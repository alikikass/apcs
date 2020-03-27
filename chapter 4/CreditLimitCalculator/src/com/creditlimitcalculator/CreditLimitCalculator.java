package com.creditlimitcalculator;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        //create new scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter account number or -1 to quit: ");
        int accountNumber = input.nextInt();

        while( accountNumber != -1){

            System.out.println("Enter balance at beginning of the month: ");
            int beginningBalance = input.nextInt();

            System.out.println("Enter total of all items charged by customer this month: ");
            int charges = input.nextInt();

            System.out.println("Enter total of all credits applied to the customer's account this month: ");
            int credits = input.nextInt();

            System.out.println("Enter allowed credit limit: ");
            int limit = input.nextInt();

            int newBalance = beginningBalance + charges - credits;

            System.out.println("New balance is: " + newBalance);

            if (newBalance > limit ){
                System.out.println("Credit limit exceeded");
            }
            else System.out.println("Credit limit not exceeded");


            System.out.println("Enter account number or -1 to quit: ");
            accountNumber = input.nextInt();

        }

    }

}
