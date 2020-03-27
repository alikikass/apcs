package com.employee;

public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) this.monthlySalary = monthlySalary;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName() {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName() {

        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

}
