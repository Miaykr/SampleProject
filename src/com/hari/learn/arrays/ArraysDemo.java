package com.hari.learn.arrays;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        //Array is a collection od homogeneous elements

        int[] arr = new int[5]; // index always starts with 0
        String[] strArr = new String[5]; // index always starts with 0

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr[i] = 10;
            } else {
                arr[i] = (i + 1) * 10;
            }

        }
        System.out.println("For loop");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("index :" + i + " value is: " + arr[i]);
        }

        //for each
        System.out.println("for each");
        for (int element : arr) {
            System.out.println(element);
        }
        System.out.println("Java 8");
        Arrays.stream(arr).forEach(System.out::println);

        //Another way

        int[] arr2 = {10, 20, 30, 40, 50};

        System.out.println(arr2.length);


    }
}
