package com.negativepositivezero;
//import scanner
import java.util.Scanner;

public class NegativePositiveZero {
    public static void main(String[] args) {
        int countp = 0, countn = 0, countz = 0;
        int[] arr = new int[5];
        //create a new scanner
        Scanner scan = new Scanner(System.in);
        //ask user for numbers
        System.out.print("Enter 5 Numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (arr[i] < 0) {
                countn++;
            } else if (arr[i] == 0) {
                countz++;
            } else {
                countp++;
            }
        }
        System.out.print("Positive Numbers: " + countp);
        System.out.print("\n Negative Numbers: " + countn);
        System.out.print("\n Zeros: " + countz);
    }
}