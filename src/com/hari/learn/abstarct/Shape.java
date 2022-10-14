package com.hari.learn.abstarct;

public abstract class Shape {
    public abstract double area();

    public static void main(String[] args) {

    }
}

class Circle extends Shape {

    private int radius;

    Circle() {
        radius = 20;
    }

    @Override
    public double area() {
        System.out.println("Circle Area:");
        return 3.14 * radius * radius;
    }
}

abstract class Rectangle extends Shape {

    private int length;
    private int breadth;

    Rectangle() {
        length = 10;
        breadth = 20;
    }

    /*@Override
    public double area() {
        System.out.println("Rectangle Area:");
        return length * breadth;
    }*/
}

// concrete class : all the methods have body , 100% concrete class can be abstract class
// abstract class : any method which do not have body
