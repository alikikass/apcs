package com.build5pt2;

public class Build5Pt2 {
    public static void main(String[] args) {
        int i = 10;
        while (i < 57) {
            while (i < 10) {
            }
            String strVal = String.valueOf(i);
            if (Integer.parseInt(String.valueOf(strVal.charAt(0))) + Integer.parseInt(String.valueOf(strVal.charAt(1))) > 10){
            System.out.println(i);
            }
            i++;
        }
    }
}
