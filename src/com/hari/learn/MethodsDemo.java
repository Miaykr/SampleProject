package com.hari.learn;

import java.util.Scanner;

public class MethodsDemo {

    //Data Members or class Variables
    //Syntax
    //type variable_name;
    String name;


    //Blocks -> 1) Methods or Member Functions
    //2) Static block, and it will be executed only once.
    //3) Instantiation blocks

    public static void main(String[] args) {
        System.out.println("This is main method");
        // calling of the method
        display("Java 8");
        MethodsDemo methodsDemo = new MethodsDemo();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 2 numbers to add:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = methodsDemo.addition(num1, num2);
        System.out.println("Sum = " + sum);
    }
    //Syntax
    //return_type method_name(argument_list -> 0 - more arguments) { // Definition of the method
    //Body
    //}

    static {
        System.out.println("This will be executed even before main method");
    }

    static void display(String name) {
        System.out.println(name);
    }


    int addition(int num1, int num2) {
        return num1 + num2;
    }


}
