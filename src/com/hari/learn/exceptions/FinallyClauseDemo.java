package com.hari.learn.exceptions;

public class FinallyClauseDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 9, 6, 7, 8};
        try{
            System.out.println(arr[70]);
        } finally {
            System.out.println("Here we perform all shutdown operations");
        }
        System.out.println("END");
    }
}
