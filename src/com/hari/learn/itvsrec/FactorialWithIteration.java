package com.hari.learn.itvsrec;

import java.util.Scanner;

public class FactorialWithIteration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();

        /*System.out.println("With for-loop:" + factorialWithIteration(number));*/
        System.out.println("With recursion:" + factWithRecursion(number));
    }

    static int factorialWithIteration(int number) {
        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        return fact;
    }

    static int factWithRecursion(int number) {
        if (number == 0) return 1;
        else return number * factWithRecursion(number - 1);
    }
}
