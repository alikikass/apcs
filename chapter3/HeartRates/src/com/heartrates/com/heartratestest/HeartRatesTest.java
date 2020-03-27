package com.heartrates.com.heartratestest;

import com.heartrates.HeartRates;

import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        HeartRates heart1 = new HeartRates("", "", 2, 31, 1969);

        System.out.println("Enter your first name: ");
        heart1.setFirstName(input.nextLine());

        System.out.println("Enter your last name: ");
        heart1.setLastName(input.nextLine());

        System.out.println("Enter your birth month (using numbers): ");
        heart1.setMonth(input.nextInt());

        System.out.println("Enter your birth date: ");
        heart1.setDay(input.nextInt());

        System.out.println("Enter your birth year:");
        heart1.setYear(input.nextInt());

        System.out.println("Age is: ");
        System.out.println(heart1.getAge());


        System.out.println("Maximum heart rate is: ");
        System.out.println(heart1.getMaxHR());

        System.out.println("Target heart rate is: ");
        System.out.println(heart1.getTargetHr());



    }
    }
