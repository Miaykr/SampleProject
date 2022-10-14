package com.hari.learn.interfaces;

public class InterfacesDemoImpl2 implements InterfacesDemo{
    @Override
    public void test() {
        System.out.println("test in InterfacesDemoImpl2");
    }

    @Override
    public void test2() {
        System.out.println("test2 in InterfacesDemoImpl2");
    }

    void display() {
        System.out.println("Display");
    }
}
