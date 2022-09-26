package com.hari.learn.exceptions;

import com.hari.learn.exceptions.custom.InsufficientBalanceException;

import java.util.Scanner;

public class ThrowClauseDemo {
    public static void main(String[] args) {

        double balance = 10000.78;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw:");
        int withdrawnAmount = scanner.nextInt();
        try {
            if (balance < withdrawnAmount) {
                //throw new InsufficientBalanceException("in sufficient funds");
                throw new InsufficientBalanceException();
            }
            System.out.println("Balance :" + (balance - withdrawnAmount));
        } catch (InsufficientBalanceException ex) {
            System.out.println("Message:" + ex.getMessage());
        }

        System.out.println("Transaction has been successfully completed...");
    }
}
