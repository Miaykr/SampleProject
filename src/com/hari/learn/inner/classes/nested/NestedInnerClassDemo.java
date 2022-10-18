package com.hari.learn.inner.classes.nested;

public class NestedInnerClassDemo {
    public static void main(String[] args) {
        /*Outer outer = new Outer();
        outer.outerMethod();

        Outer.Inner inner = new Outer().new Inner();
        inner.innerMethod();
        System.out.println(inner.id);*/

        Outer.InnerInterface innerInterface = new Outer().new InnerInterfaceImpl();
        innerInterface.test();
    }
}

class Outer {

    private int id = 20;

    interface InnerInterface {
        void test();
    }

    class InnerInterfaceImpl implements InnerInterface {
        @Override
        public void test() {
            System.out.println("InnerInterfaceImpl's test()");
        }
    }

    class Inner {
        int id = 10;

        Inner() {
            System.out.println("Inner class constructor");
        }

        protected void innerMethod() {
            System.out.println("Inner class Id: " + Outer.this.id);
            System.out.println("Inner class Id: " + id);
            System.out.println("Inside innerMethod()");
            String[] arr = {"abc", "pqr"};
            main(arr);
        }

        public void main(String[] arr) {
            System.out.println(arr);
        }
    }

    void outerMethod() {
        int a = 20;
        System.out.println("Inside outerMethod");
    }
}