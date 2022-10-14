package com.hari.learn.loops;

import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = scanner.nextInt();
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            sum += temp;
            temp--;
        }

        System.out.println(sum);

        int temp2 = n;
        int sum2 = 0;
        do {
            sum2 += temp2;
            temp2--;
        } while (temp2 > 0);
        System.out.println(sum2);


        int sum3 = 0;

        for (int temp3 = n; temp3 > 0; temp3--) {
            sum3 += temp3;
        }
        System.out.println(sum3);
    }
}
