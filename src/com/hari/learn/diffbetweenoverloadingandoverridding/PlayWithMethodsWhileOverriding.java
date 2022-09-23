package com.hari.learn.diffbetweenoverloadingandoverridding;

public class PlayWithMethodsWhileOverriding {
    public static void main(String[] args) {
        /*Employee employee = new Employee();
        employee.test();

        LocalEmployee localEmployee = new LocalEmployee();
        localEmployee.test();

        Employee employee1 = new LocalEmployee();
        employee1.test();*/

        //Casting

        /*Employee employee = new LocalEmployee();
        LocalEmployee localEmployee = (LocalEmployee) employee;
        localEmployee.test();*/

        try {
            Employee employee = new Employee();
            LocalEmployee localEmployee = (LocalEmployee) employee;
            localEmployee.test();
        } catch (ClassCastException ex) {
            System.out.println("Please check you are ding down casting");
        }
        System.out.println("END");

        //Casting rules 1) while casting there should be some relation 2) down casting is not possible
    }
}

class Employee {
    void test() {
        System.out.println("test() in Employee");
    }
}

class LocalEmployee extends Employee {
    void test() {
        System.out.println("test() in LocalEmployee");
    }
}
