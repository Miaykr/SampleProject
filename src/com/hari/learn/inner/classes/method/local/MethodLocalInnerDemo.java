package com.hari.learn.inner.classes.method.local;

public class MethodLocalInnerDemo {
    public static void main(String[] args) {
        //Method Local Inner class
        Outer outer = new Outer();
        outer.outerMethod();

        //Nested Inner
        Outer.NestedInner nestedInner = new Outer().new NestedInner();
        nestedInner.nestedInnerMethod();

    }
}

class Outer {
    private int outerId = 100;

    void outerMethod() {

        int outerLocalId = 4000;

        System.out.println("Inside outerMethod");

        class MethodLocalInner { //Start MethodLocalInner
            private int id = 10;

            void methodLocalInnerMethod() {
                System.out.println("inside methodLocalInnerMethod...");
                System.out.println("MethodLocalInner's id: " + id);
                System.out.println("MethodLocalInner's id: " + Outer.this.outerId);
                System.out.println("outerLocalId: " + outerLocalId);
            }
        } // End MethodLocalInner

        MethodLocalInner methodLocalInner = new MethodLocalInner();
        methodLocalInner.methodLocalInnerMethod();
    }

    class NestedInner {
        void nestedInnerMethod() {
            final int i = 10;
            System.out.println("nestedInnerMethod");
            System.out.println("OuterId:" + Outer.this.outerId);
        }
    }
}
