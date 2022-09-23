package com.hari.learn.diffbetweenoverloadingandoverridding;

public class OverLoadingDemo {
    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(2, 3, 4));
        System.out.println(add(2, 3, 4, 5));
    }

    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    static int add(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }
}
