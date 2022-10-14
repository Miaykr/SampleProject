package com.hari.learn.interfaces.multipleInheritance;

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Parent1 parent1 = new Child1();
        parent1.test1();
    }
}

interface Parent1 {
    void test1();
}

interface Parent2 {
    void test1();
}

class Child1 implements Parent1, Parent2 {
    @Override
    public void test1() {
        System.out.println("Child1");
    }
}
//single level
//multi level
//multiple (2 parents one child)


