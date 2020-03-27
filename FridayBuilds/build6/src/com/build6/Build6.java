package com.build6;
import java.util.Scanner;

public class Build6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get all prime numbers less than this number: ");
        int n = input.nextInt();
        int x = 0;
        boolean flag = false;

        while (x != n) {
            x = x + 1;
            for (int i = 2; i <= x / 2; ++i) {
                if (x % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(x);
            }


        }

    }
}

