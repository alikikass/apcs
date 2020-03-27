package com.smallestvalue;
import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int smallest = 0; //;
        int number = 0;

        System.out.println("How many numbers will you enter? ");
        int total = input.nextInt();


        for (int counter = 1; counter <= total; counter++) {
            System.out.print("Enter number: ");
            number = input.nextInt();

            if (counter == 1)
                smallest = number;
        }
        System.out.println("Smallest integer is " + smallest);
    }

        }



