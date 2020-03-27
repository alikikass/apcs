package com.salarycalculator;

import java.util.Scanner;


public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++ ) {

            System.out.println("Enter employee name: ");
            String employee = input.nextLine();

            System.out.println("Enter hours worked last week: ");
            double hours = input.nextDouble();
            input.nextLine();

            System.out.println("Enter hourly rate: ");
            double rate = input.nextDouble();
            input.nextLine();

            double pay = 0;
            if (hours > 40){
                pay = ((hours - 40) * (rate*1.5)) + (rate*40);
            } else {
                pay = hours * rate;
            }
            System.out.println("Gross pay: " + pay);
        }


    }
}
