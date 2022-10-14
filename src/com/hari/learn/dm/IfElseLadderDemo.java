package com.hari.learn.dm;

import java.util.Scanner;

public class IfElseLadderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student marks:");
        int marks = scanner.nextInt();

        if (true) {
            System.out.println("It will print always");
        }

        if (marks >= 75) {
            System.out.println("Distinction");
        } else if (marks < 74 && marks >= 60) {
            System.out.println("First Class");
        } else if (marks < 59 && marks >= 50) {
            System.out.println("Second Class");
        } else if (marks < 49 && marks >= 35) {
            System.out.println("Third Class");
        } else {
            System.out.println("FAIL");
        }


    }
}
