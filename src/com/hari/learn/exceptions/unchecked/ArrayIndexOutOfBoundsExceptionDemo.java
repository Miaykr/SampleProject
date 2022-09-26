package com.hari.learn.exceptions.unchecked;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        String[] strArr = {"Suresh", "Ajay", "Hari"};
        try {
            System.out.println(strArr[3]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Please check you are accessing wrong index");
        }
        System.out.println("END");
    }
}
