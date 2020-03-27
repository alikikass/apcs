package com.modifiedinterest;

public class ModifiedInterest {
    public static void main(String[] args) {
        double amount;
        double principal = 1000.0;
        double rate = 0.05;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (rate = 0.05; rate <= 0.1; rate += 0.01) {
            
            for (int year = 1; year <= 10; ++year) {
                amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%4d%, 20.2f%n", year, amount);
            }
        }
    }
}
