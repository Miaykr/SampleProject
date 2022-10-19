package com.hari.learn.exceptions.unchecked;


public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);

        person = null;
        try {
            System.out.println(person.getId());
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("END");

    }
}

class Person {
    private int id;
    private String name;

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
}
