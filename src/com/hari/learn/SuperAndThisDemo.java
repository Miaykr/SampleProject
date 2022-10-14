package com.hari.learn;

public class SuperAndThisDemo {
    public static void main(String[] args) {

    }

    void display() {
        B b = new B();
    }
}

class A {
    int i = 10;

    A() {
        System.out.println("A");
    }
}

class B extends A {

    int i = 20;
    int a;

    B() {
        System.out.println(super.i);
        System.out.println("B");
    }

    B(int a) {
        this();
        this.a = a;
        System.out.println("B's a values is:" + this.a);
    }
}

class C extends B {
    int a;

    C(int a) {
        this.a = a;
        System.out.println("C's a values is:" + this.a);
    }

    C() {
        super(40);
        System.out.println("C");
    }
}