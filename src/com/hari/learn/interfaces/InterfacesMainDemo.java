package com.hari.learn.interfaces;

public class InterfacesMainDemo {
    public static void main(String[] args) {
        //InterfacesDemo interfacesDemo = new InterfacesDemoImpl();
        InterfacesDemo interfacesDemo = new InterfacesDemoImpl2();
        interfacesDemo.test();
        System.out.println(interfacesDemo.PI_VALUE);
        interfacesDemo.test2();
    }
}