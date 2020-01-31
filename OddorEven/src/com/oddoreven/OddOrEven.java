package com.oddoreven;
//import scanner
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
      //create new Scanner
        Scanner input = new Scanner(System.in);
      // ask user for number
        System.out.println("Enter a number: ");
      int number = input.nextInt();
      //evaluate whether that number is even or odd
       if ((number % 2) == 0)
        System.out.println("The number is even");
       else
           System.out.println("The number is odd");





    }
}
