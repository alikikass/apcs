package com.modifiedaccountclass;


import java.util.Scanner;

public class ModifiedAccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        //show original balances
        System.out.printf("%s balance: $%.2f%n" ,
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());

        //create new scanner
        Scanner input = new Scanner(System.in);

        //get amount for deposit and add it to account 1's balance
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance %n%n", depositAmount);
        account1.deposit(depositAmount);

        //display balances
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());

        //get amount for deposit and add it to account 2
        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance %n%n", depositAmount);
        account2.deposit(depositAmount);

        //display balances
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());

        //get withdrawal amount and withdraw from account 1
        System.out.println("Enter withdrawal amount for account1: ");
        double withdrawalAmount = input.nextDouble();
        account1.withdraw(withdrawalAmount);

        //display balances
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());

        //get withdrawal amount and withdraw from account 2
        System.out.println("Enter withdrawal amount for account2: ");
        withdrawalAmount = input.nextDouble();
        account2.withdraw(withdrawalAmount);

        //display balances
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());


    }
}
