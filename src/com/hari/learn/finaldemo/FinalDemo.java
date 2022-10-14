package com.hari.learn.finaldemo;

//final
//1. to create a constant
//2. to restrict overriding a method to subclass
//2. to restrict inheritance
public class FinalDemo {

    private static final double PI_VALUE;

    static {
        PI_VALUE = 3.14;
    }

    public static void main(String[] args) {
        System.out.println(PI_VALUE);
    }
}
