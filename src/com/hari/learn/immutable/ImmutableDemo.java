package com.hari.learn.immutable;

import java.util.HashMap;
import java.util.Map;

public class ImmutableDemo {
    public static void main(String[] args) {
        Map<String, String> courses = new HashMap<>();
        courses.put("1", "Java");
        courses.put("2", "C");
        courses.put("3", "C++");

        Person person = new Person(1, "Suresh", courses);
        System.out.println(person);

        courses.put("4", "Web Services");
        System.out.println("After change");
        System.out.println(person);

        courses.put("5", "Spring Boot");
        System.out.println("After change");
        System.out.println(person);
    }
}

final class Person {
    private final int id;
    private final String name;
    private final Map<String, String> courses;

    Person(int id, String name, Map<String, String> courses) {
        this.id = id;
        this.name = name;

        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> course : courses.entrySet()) {
            tempMap.put(course.getKey(), course.getValue());
        }
        this.courses = tempMap;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getCourses() {
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> course : courses.entrySet()) {
            tempMap.put(course.getKey(), course.getValue());
        }
        return tempMap;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name='" + name + '\'' + ", courses=" + courses + '}';
    }
}

//Immutable class Caching, thread-safe,  String and all Wrapper classes(Integer,
//Data inconsistencies
