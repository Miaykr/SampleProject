package com.hari.learn.object;

import java.util.Objects;

public class ObjectClassDemo {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Ajay");
        Person person2 = new Person(1, "Ajay");

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
        int a = 20;
        double b = 20;
        System.out.println(a == b);
    }
}

class Person {
    private int id;
    private String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
