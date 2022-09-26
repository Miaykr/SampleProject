package com.hari.learn.exceptions.unchecked;

import java.util.Locale;

public class StringIndexOutOfBoundExceptionDemo {
    public static void main(String[] args) {
        String str = "Java 8";
        System.out.println(str);

        System.out.println(str.length());
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str.toUpperCase(Locale.ROOT));
        try {
            System.out.println(str.charAt(10));
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("Please check you are aceessing wrong string index");
        }
        System.out.println(str.compareTo("java 8"));
        System.out.println(str.equals("java 8"));
        System.out.println(str.equalsIgnoreCase("java 8"));

        System.out.println(str.concat(" Programming"));

        System.out.println("Version: " + str.substring(5));
        System.out.println("Version: " + str.substring(0, 4));
        /*Employee employee = new Employee(1, "Bob");
        System.out.println(employee);*/
    }
}

class Employee {
    private int id;
    private String name;

    Employee(int id, String name) {
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
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
