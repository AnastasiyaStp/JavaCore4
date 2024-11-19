package com.example;

class Employee {
    private String name;
    private double salary;
    private Gender gender;

    public Employee(String name, double salary, Gender gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " (Salary: " + salary + ", Gender: " + gender + ")";
    }
}
