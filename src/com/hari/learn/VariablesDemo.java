package com.hari.learn;

public class VariablesDemo {

    static int x = 100;// Global variable

    public static void main(String[] args) {
        int x = 200; // always local variable will be given the highest priority
        System.out.println(x);
        System.out.println(args);
    }

    void test() {
        //System.out.println(args);
    }
}
