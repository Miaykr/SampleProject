package com.hari.learn.am.defaultpkg;

import com.hari.learn.am.AccessModifiersDemo;

public class DefaultAccessModifierDemo {
    public static void main(String[] args) {
        AccessModifiersDemo accessModifiersDemo = new AccessModifiersDemo();
        //System.out.println(accessModifiersDemo.id);
        //System.out.println(accessModifiersDemo.name); // across package I cannot access default data
        //System.out.println(accessModifiersDemo.salary);
        System.out.println(accessModifiersDemo.birthDate);
    }
}
