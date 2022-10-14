package com.hari.learn.cbvcbr;

import java.util.Scanner;

public class CallByValueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a and b:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Call by value");
        System.out.println("Before");
        System.out.println("a :" + a);
        System.out.println("b :" + b);
        changedSum(a, b);
        System.out.println("After:");
        System.out.println("a :" + a);
        System.out.println("b :" + b);

        System.out.println("Call by reference");
        Person person = new Person(1, "Hari");
        System.out.println(person);
        changePersonData(person);
        System.out.println(person);
    }

    static void changedSum(int a, int b) {
        a = a + 20;
        b = b + 20;
    }

    static void changePersonData(Person p) {
        p.name = "Hari Kiran";
    }
}

class Person {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}



