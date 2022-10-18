package com.hari.learn.inner.classes.anonymous;

public class AsAImplementerOfTheSpecifiedInterface {
    public static void main(String[] args) {
        SubOuterClass2 subOuterClass2 = new SubOuterClass2();
        subOuterClass2.outerI.test();

        OuterI anotherOuterI = subOuterClass2.outerI;
        anotherOuterI.test();
    }
}

interface OuterI {
    void test();
}

class SubOuterClass2 {
    OuterI outerI = new OuterI() {
        @Override
        public void test() {
            System.out.println("Anonymous Inner implementer of interface test()");
        }
    };
}
