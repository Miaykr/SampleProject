package com.hari.learn.inner.classes.staticinner;

public class StaticInnerClassesDemo {
    public static void main(String[] args) {
        // To access Outer class data
        Outer outer = new Outer();
        outer.outerMethod();
        Outer.sm();

        //To access Static InnerClass Data
        Outer.Inner inner = new Outer.Inner();
        System.out.println(inner.innerId);
        inner.innerMethod();

    }
}

class Outer {

    static int id = 200;

    void outerMethod() {
        System.out.println("Inside outerMethod...");
    }

    static void sm() {
        int i = 20;// what is the scope of this I, or lifetime of this I
        System.out.println("Outer Id:" + id);
        System.out.println("Local:" + i);
    }

    static class Inner {

        int innerId = 200;

        void innerMethod() {
            System.out.println("Inside innerMethod...");
        }
    }

    static {
        int i = 20;
        System.out.println(id);
    }
}
