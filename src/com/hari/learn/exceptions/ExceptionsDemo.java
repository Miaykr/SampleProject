package com.hari.learn.exceptions;

import java.util.Scanner;

public class ExceptionsDemo {
    public static void main(String[] args) {
        //Implict and Explict
        System.out.println("START");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        try {
            int c = a / b;
            System.out.println(c);
            System.out.println("Java 8");
        } catch (ArithmeticException ex) {
            System.out.println("Please enter proper values since / by zero error result");
        }

        System.out.println("END");


    }
}

// try, catch, throw, throws and finally
