package com.hari.learn.inner.classes.anonymous;

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.test();

        SubOuterClass subOuterClass = new SubOuterClass();
        subOuterClass.show();

        System.out.println(subOuterClass.i);
        subOuterClass.outerClass.test();
    }
}

class OuterClass {
    void test() {
        System.out.println("test in side OuterClass");
    }
}

class SubOuterClass {

    void show() {
        System.out.println("SubOuterClass' show");
    }


    OuterClass outerClass = new OuterClass() {
        @Override
        void test() {
            System.out.println("test in side In Anonymous Inner class");
        }
    };

    int i = 20;
}
