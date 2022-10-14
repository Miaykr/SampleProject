package com.hari.learn.abstarct;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println(shape.area());

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Suresh"));
        employeeList.add(new Employee(2, "Ajay"));
        employeeList.add(new Employee(3, "Hari"));
        employeeList.add(new Employee(4, "RK"));

        employeeList.stream().map(Employee::getName).forEach(System.out::println);

        List<String> namesList2 = new ArrayList<>();
        for (Employee employee : employeeList) {
            namesList2.add(employee.getName());
        }
        System.out.println("Before Java 8:" + namesList2);
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
}