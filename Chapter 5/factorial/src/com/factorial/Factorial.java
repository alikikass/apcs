package com.factorial;

public class Factorial {
    public static void main(String[] args) {
        int counter;
        long factorials = 1;

        for( counter = 1; counter <= 20; counter++ ){
            factorials *= counter;
            System.out.println( counter);
            System.out.println(factorials);

        }
    }

}
