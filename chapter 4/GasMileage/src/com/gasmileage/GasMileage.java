package com.gasmileage;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //ask user for miles driven
        System.out.println("Enter miles driven or -1 to quit: ");
        int miles = input.nextInt();

        //ask user for gallons used
        System.out.println("Enter gallons of gas used or -1 to quit: ");
        int gallons = input.nextInt();

        int totalMiles = 0;
        int totalGallons = 0;

        while (miles != -1 && gallons != -1){
            totalMiles = totalMiles + miles;
            totalGallons = totalGallons + gallons;

            System.out.println("Enter miles driven or -1 to quit: ");
            miles = input.nextInt();

            System.out.println("Enter gallons used or -1 to quit: ");
            gallons = input.nextInt();
        }
           double milesPerGallon = totalMiles / totalGallons;
           System.out.println("Total miles per gallons used is: " + milesPerGallon);

        }
    }







