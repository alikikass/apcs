package com.hemophilia;
import java.util.Scanner;
public class Hemophilia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Is the mother a hemophiliac? \nType 1 for YES, 2 if the mother is a CARRIER and 3 if NO");
        int m = input.nextInt();
        System.out.println("Is the father a hemophiliac? \nType 1 for YES and 2 for NO");
        int d = input.nextInt();

        if ((m == 1) && (d == 1)){
            System.out.println("If the baby is a girl, there is an 100% chance of her being a hemophiliac," +
                    "\nIf baby is a boy, there is an 100% chance of him being a hemophiliac");
        }
        if ((m == 1) && (d == 2)){
            System.out.println("If the baby is a girl, there is an 100% chance of her being a carrier for hemophilia," +
                    "\nIf the baby is a boy there is an 100% chance of him being a hemophiliac");
        }
        if ((m == 2) && (d == 1)){
            System.out.println("If the baby is a girl, there is a 50% chance she will be a hemophiliac and a 50% chance" +
                    " she will be a carrier for the trait, \nIf the baby is a boy, there is a 50% chance he will" +
                    "be a hemophiliac");
        }
        if ((m == 2) && (d == 2)){
            System.out.println("If the baby is a girl, there is a 50% chance she will be a carrier for hemophilia, \nIf " +
                    "the baby is a boy, there is a 50% chance he will be a hemophiliac");
        }
        if ((m == 3) && (d == 1)){
            System.out.println("If the baby is a girl, there is an 100% chance she will be a carrier for hemophilia," +
                    "\nIf the baby is a boy, there is a 0% chance of him being a hemophiliac");
        }
        if ((m == 3) && (d == 2)){
            System.out.println("If the baby is a girl, there is a 0% chance of her being a hemophiliac, " +
                    "\nIf the baby is a boy, there is a 0% chance of him being a hemophiliac");
        }
    }
}
