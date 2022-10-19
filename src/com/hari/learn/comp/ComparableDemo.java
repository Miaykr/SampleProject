package com.hari.learn.comp;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparableDemo {
    public static void main(String[] args) {
        /*List<String> stringList = Arrays.asList("Ajay", "Hari", "Durga", "Suresh");
        System.out.println("Before sort:" + stringList);
        Collections.sort(stringList);
        System.out.println("After sort:" + stringList);*/

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Suresh", 9234.67));
        studentList.add(new Student(2, "Ajay", 5234.67));
        studentList.add(new Student(3, "Hari", 6234.67));
        studentList.add(new Student(4, "Durga", 7234.67));
        /*System.out.println("Before sorting:");
        studentList.forEach(System.out::println);
        Collections.sort(studentList);
        System.out.println("After sorting:");
        studentList.forEach(System.out::println);*/

        List<Student> sortedList = studentList.stream()
                .filter(student -> student.getSalary() > 6000)
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);


        /*System.out.println("===============================");
        for (Student student : studentList) {
            System.out.println(student);
        }*/

    }
}

@Data
class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double salary;

    public Student(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Student student) {
        /*if (this.getSalary() > student.getSalary()) {
            return 1;
        } else if (this.getSalary() < student.getSalary()) {
            return -1;
        } else return 0;*/

        return this.getName().compareTo(student.getName());
    }
}
