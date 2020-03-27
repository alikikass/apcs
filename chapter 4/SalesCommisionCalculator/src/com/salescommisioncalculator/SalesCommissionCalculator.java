package com.salescommisioncalculator;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter how many of item 1 were sold: ");
        int sales1 = input.nextInt();

        System.out.println("Enter how many of item 2 were sold: ");
        int sales2 = input.nextInt();

        System.out.println("Enter how many of item 3 were sold: ");
        int sales3 = input.nextInt();

        System.out.println("Enter how many of item 4 were sold: ");
        int sales4 = input.nextInt();

        double grossSales = item1*sales1 + item2*sales2 + item3*sales3 + item4*sales4;
        System.out.println("Gross sales for the week: $" + grossSales);

        double earnings = Math.round(200.00 + grossSales*.09);
        System.out.println("Total earnings for the week (rounded): $" + earnings);


    }
}
