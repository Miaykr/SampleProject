package com.hari.learn.exceptions.unchecked;

import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        try {
            c = a / b;
            System.out.println("Result:" + c);
        } catch (ArithmeticException ex) {
            System.out.println("Please handle / zero exception");
        }
        System.out.println("End");

    }
}
