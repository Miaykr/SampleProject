package com.hari.learn.staticdm;

public class StaticCompleteUnderstandingDemo {
    public static void main(String[] args) {
        Increment increment1 = new Increment();
        System.out.println("First:" + increment1.increment());

        Increment increment2 = new Increment();
        System.out.println("Second:" + increment2.increment());
    }
}

class Increment {
    private static int num = 10;
    String name = "Suresh";
    int increment() {
        return ++num;
    }
}
