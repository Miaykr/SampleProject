package com.hari.learn.exceptions;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 6, 7, 8, 9, 10, 0};
        String str = "Java 8";

        try {
            System.out.println(arr[1]);
            System.out.println(str.charAt(190));
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Please check there is an array index out of bounds");
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("Please check there is an string index out of bounds");
        } catch (RuntimeException ex) {
            System.out.println("There is an runtime exception");
        }

        System.out.println("END");
    }
}
