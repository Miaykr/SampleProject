package com.hari.learn.casting;

public class CastingObjectsDemo {
    public static void main(String[] args) {
        // play with data members
        // compile time
        LocalPerson localPerson = new LocalPerson();
        System.out.println(localPerson.something);
        System.out.println(localPerson.anything);

        Person person = new LocalPerson();
        System.out.println(person.something);


        //Person person = new Person();

        //System.out.println(person.something);
        //person.test();
    }
}

//The process of overriding is initiated only when there is an inheritance
class Person {
    int something = 200;
    void test(){
        System.out.println("test() in Person");
    }
}

class LocalPerson extends Person {
    int something = 400;
    int anything = 500;
    void test(){
        System.out.println("test() in LocalPerson");
    }
}