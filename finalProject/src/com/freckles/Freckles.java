package com.freckles;
import java.util.Scanner;

public class Freckles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Does the father have freckles?");
        System.out.println("Type 1 for NO and 2 for YES: ");
        int d = input.nextInt();
        if (d == 2){
            System.out.println("Is the father homozygous for or heterozygous for this trait?");
            System.out.println("If homozygous, type 2, if heterozygous, type 3: ");
            d = input.nextInt();
        }

        System.out.println("Does the mother have freckles?");
        System.out.println("Type 1 for NO and 2 for YES: ");
        int m = input.nextInt();
        if (m == 2){
            System.out.println("Is the mother homozygous for or heterozygous for this trait?");
            System.out.println("If homozygous, type 2, if heterozygous, type 3: ");
            m = input.nextInt();
        }

        if (( m == 1) && (d == 1)){
            System.out.println("There is a 0% chance the baby will have freckles");
        }
        if ((m == 2) && (d == 3)){
            System.out.println("There is an 100% chance the baby will have freckles");
        }
        if ((m == 3) && (d == 2)){
            System.out.println("There is an 100% chance the baby will have freckles");
        }
        if ((m == 3) && (d == 3)){
            System.out.println("There is a 75% chance the baby will have freckles");
        }
        if((m == 2) && (d == 2)){
            System.out.println("There is an 100% chance the baby will have freckles");
        }
        if((m == 1) && (d == 2)) {
            System.out.println("There is an 100% chance the baby will have freckles");
        }
        if((m == 2) && (d == 1)) {
            System.out.println("There is an 100% chance the baby will have freckles");
        }
        if((m == 1) && (d == 3)){
            System.out.println("There is an 50% chance the baby will have freckles");
        }
        if((m == 3) && (d == 1)){
            System.out.println("There is an 50% chance the baby will have freckles");
        }
    }
}
