package com.hari.learn;

/**
 * Static blocks can access static data
 * Non static blocks can access booth static and non static data
 */
public class StaticAndNonStaticDemo {

    static String name = "Java 8";  // Global variable

    public static void main(String[] args) {
        System.out.println("This is main().");
        int a = 10;//Local variable
        show();
        System.out.println("Main:" + name);
    }

    static void show() {
        System.out.println("This is show().");
        System.out.println("Show:" + name);
        show2();

        StaticAndNonStaticDemo staticAndNonStaticDemo = new StaticAndNonStaticDemo();
        staticAndNonStaticDemo.display();

        AnotherClass anotherClass = new AnotherClass();
        anotherClass.anotherShow();
        AnotherClass.anotherStaticShow();
    }

    static void show2() {
        System.out.println("This is show().");
        System.out.println("Show:" + name);
    }

    void display() {
        System.out.println("This is non-static in display().");
    }
}

class AnotherClass {

    void anotherShow() {
        System.out.println("This is anotherShow().");
    }

    static void anotherStaticShow() {
        System.out.println("This is anotherStaticShow().");
    }

}
