package com.hari.learn.dm;

import java.util.Scanner;

public class IfStmtDemo {
    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num:");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("EVEN");
            System.out.println("Hello");
        } else {
            System.out.println("Not EVEN");
        }
    }
}
