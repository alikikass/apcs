package com.build4;

public class Build4 {
    public static void main(String[] args) {
        int n = 0;
        while (n != 100){
             n = n + 1;

            if (((n % 3) == 0)  && ((n % 5) == 0)){
                System.out.println("Go Warriors");
            }

                else if ((n % 3) == 0) {
                 System.out.println("Go");
            }
                    else if ((n % 5) == 0){
                     System.out.println("Warriors");

            }
                        else {
                            System.out.println(n);

            }


        }


    }
}
