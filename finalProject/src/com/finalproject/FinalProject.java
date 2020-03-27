package com.finalproject;
import java.util.Scanner;
import com.bloodpressure.BloodPressure;
import com.hair.Hair;
import com.astigmatism.Astigmatism;
import com.nearsightedness.NearSightedness;
import com.freckles.Freckles;
import com.dimples.Dimples;
import com.colorblindness.ColorBlindness;
import com.hemophilia.Hemophilia;

public class FinalProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("GENETIC TRAITS CALCULATOR!");
        System.out.println("Type the number that corresponds with the trait you would like calculated: \n1-Blood Pressure" +
                " \n2-Hair Type \n3-Astigmatism \n4-Near-Sightedness \n5-Freckles \n6-Dimples \n7-Color Blindness" +
                " \n8-Hemophilia \nType 9 to cancel \nWhat trait do you want calculated?: ");
        int c = input.nextInt();
        while (c != 9){
            if (c == 1){
                BloodPressure.main(args);
            }
            if (c == 2){
                Hair.main(args);
            }
            if (c == 3){
                Astigmatism.main(args);
            }
            if (c == 4){
                NearSightedness.main(args);
            }
            if (c == 5){
                Freckles.main(args);
            }
            if (c == 6){
                Dimples.main(args);
            }
            if(c == 7){
                ColorBlindness.main(args);
            }
            if(c == 8){
                Hemophilia.main(args);
            }
            System.out.println("\nType the number that corresponds with the trait you would like calculated: \n1-Blood Pressure" +
                    " \n2-Hair Type \n3-Astigmatism \n4-Near-Sightedness \n5-Freckles \n6-Dimples \n7-Color Blindness" +
                    " \n8-Hemophilia \nType 9 to cancel \nWhat trait do you want calculated?: ");
             c = input.nextInt();
        }


    }
}
