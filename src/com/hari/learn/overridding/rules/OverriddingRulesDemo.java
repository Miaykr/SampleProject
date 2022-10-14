package com.hari.learn.overridding.rules;

public class OverriddingRulesDemo {
    public static void main(String[] args) throws Exception {
        /*A aa = new A();
        aa.m1();*/
        A a = new B();
        a.m1();

        a.m2();

        /*B.m1();
        A.m1();*/
    }
}

class A {
    public void m1() throws Exception{
        System.out.println("A's m1");
    }

    void m2() {
        System.out.println("A's m2");
    }
}

class B extends A {
    public void m1() {
        System.out.println("B's m1");
    }

    public void m2() throws RuntimeException{
        System.out.println("A's m2");
    }
}
