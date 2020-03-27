package com.build5;

public class Build5 {
    public static void main(String[] args) {
        for (int i = 1; i<10; i++){
            for (int j = 0; j < 10; j++){
                System.out.println(String.valueOf(i) + String.valueOf(j) + "," + String.valueOf(i) + String.valueOf(j) + "=" + (i + j));

            }
        }
    }

}

