package com.hari.learn.constructors;

public class ConstructorChain {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A {

    A() {
        //super()
        System.out.println("A");
    }
}

class B extends A {
    B() {
        //super()
        System.out.println("B");
    }
}

class C extends B {
    /*C() {
        //First statement in constructor is super() or this()
        System.out.println("C");
    }*/
}

// If there is no constructor compiler will take care of putting the default const
