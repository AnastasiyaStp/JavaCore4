package com.example;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("Alice", 50000, Gender.FEMALE),
                new Employee("Bob", 60000, Gender.MALE),
                new Employee("Charlie", 55000, Gender.MALE),
                new Employee("Diana", 52000, Gender.FEMALE)
        };

        LocalDate today = LocalDate.now();
        if (today.getMonthValue() == 12 && today.getDayOfMonth() == 31) {
            celebrateHoliday(employees, Holiday.NEW_YEAR);
        }

        if (today.getMonthValue() == 3 && today.getDayOfMonth() == 8) {
            celebrateHoliday(employees, Holiday.MARCH_8);
        }

        if (today.getMonthValue() == 2 && today.getDayOfMonth() == 23) {
            celebrateHoliday(employees, Holiday.FEBRUARY_23);
        }
    }

    public static void celebrateHoliday(Employee[] employees, Holiday holiday) {

        for (Employee emp : employees) {
            switch (holiday) {
                case NEW_YEAR:
                    System.out.println("С Новым Годом, " + emp.getName() + "!");
                    break;
                case MARCH_8:
                    if (emp.getGender() == Gender.FEMALE) {
                        System.out.println("С 8 марта, " + emp.getName() + "!");
                    }
                    break;
                case FEBRUARY_23:
                    if (emp.getGender() == Gender.MALE) {
                        System.out.println("С 23 февраля, " + emp.getName() + "!");
                    }
                    break;
                default:
                    break;
            }
        }
    }
}