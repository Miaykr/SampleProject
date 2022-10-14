package com.hari.learn.dm;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student Grade:");
        String grade = scanner.nextLine();

        switch (grade){
            case "A" :
                System.out.println("75");
                break;
            case "B" :
                System.out.println("60");
                break;
            default:
                System.out.println("FAIL");
        }
    }
}
