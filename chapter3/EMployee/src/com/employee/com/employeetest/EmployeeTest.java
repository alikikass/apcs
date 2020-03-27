package com.employee.com.employeetest;

import com.employee.Employee;

public class EmployeeTest {
    public static void main(String[] args) {

        //create employee objects
        Employee employee1 = new Employee("Aliki", "Kassioti", 20);
        Employee employee2 = new Employee("Katerina", "Kassioti", 40);

        //show data
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " " + employee1.getMonthlySalary()*12);
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " " + employee2.getMonthlySalary()*12);

        //give each a 10% raise
        employee1.setMonthlySalary(employee1.getMonthlySalary() * 1.1);
        employee2.setMonthlySalary(employee2.getMonthlySalary() * 1.1);

        //display data
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " " + employee1.getMonthlySalary());
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " " + employee2.getMonthlySalary());

    }
}
