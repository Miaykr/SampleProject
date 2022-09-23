package com.hari.learn.constructors;

public class ConstructorDemo {
    public static void main(String[] args) {
        System.out.println("With No-arg const");
        Person person1 = new Person();
        System.out.println(person1.getId());
        System.out.println(person1.getName());
        System.out.println(person1.getSalary());
        System.out.println("*******");
        Person person2 = new Person();
        System.out.println(person2.getId());
        System.out.println(person2.getName());
        System.out.println(person2.getSalary());
        System.out.println("With Parameterized const");

        Person person3 = new Person(3, "Suresh", 1234678.89);
        Person person4 = new Person(4, "Hari", 1284678.89);
        System.out.println(person3.getId());
        System.out.println(person3.getName());
        System.out.println(person3.getSalary());
        System.out.println("*******");
        System.out.println(person4.getId());
        System.out.println(person4.getName());
        System.out.println(person4.getSalary());

        //person.details();
    }
}

class Person {

    private int id;
    private String name;
    private double salary;

    // Constructor has the same name as class name
    // It is like method but without return type
    // It is user to create/initialize an object for the class
    // we have 2 different types of constructors 1) default constructor or No-argument constructor 2) Parameterized constructor

    //It always creates an object with same data
    Person() {
        id = 10;
        name = "Ajay";
        salary = 12345.78;
    }

    Person(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    void details() {
        System.out.println("Person details");
    }

    void test() {
        System.out.println("test() in Person");
    }
}

class PermanentEmployee extends Person {

}


