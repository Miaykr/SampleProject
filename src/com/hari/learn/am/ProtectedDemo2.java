package com.hari.learn.am;

public class ProtectedDemo2 extends AccessModifiersDemo {
    public static void main(String[] args) {
        AccessModifiersDemo accessModifiersDemo = new AccessModifiersDemo();
        //System.out.println(accessModifiersDemo.id);
        System.out.println(accessModifiersDemo.name);
        System.out.println(accessModifiersDemo.salary);
        System.out.println(accessModifiersDemo.birthDate);
    }
}
