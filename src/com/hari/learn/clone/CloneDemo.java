package com.hari.learn.clone;

import lombok.Data;

public class CloneDemo {
    public static void main(String[] args) {
        try {
            Address address = new Address("Tenali", "Kollipara");
            Person person = new Person(1, "Suresh", address);
            Person clonedPerson = (Person) person.clone();

            person.setName("Ajay");
            person.getAddress().setCity("Gunter");

            System.out.println("Person:" + person);
            System.out.println("clonedPerson: " + clonedPerson);
        } catch (CloneNotSupportedException ex) {
            System.out.println("Check whether you are implementing Cloneable interface");
        }
    }
}

@Data
class Person implements Cloneable {
    private int id;
    private String name;
    private Address address;

    Person(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    //Shallow copy
    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        Address address = new Address(person.getAddress().getCity(), person.getAddress().getStreet());
        person.setAddress(address);
        return person;
    }
}

@Data
class Address {
    private String city;
    private String street;

    Address(String city, String street) {
        this.city = city;
        this.street = street;
    }
}
