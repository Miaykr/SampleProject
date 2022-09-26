package com.hari.learn.exceptions.unchecked;

import java.util.ArrayList;
import java.util.List;

public class NumberFormatExceptionDemo {

    public static void main(String[] args) {
        String str = "200l";
        try {
            int parseInt = Integer.parseInt(str);
            System.out.println(parseInt);
        } catch (NumberFormatException ex) {
            System.out.println("Please check you are trying to convert into wrong format");
        }
        System.out.println("END");
    }
}
