package com;
public class PartTimeWage {
    public static void main(String[] args) {

        // Constants
        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;

        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS = 8;
        final int PART_TIME_HOURS = 8; // As per your requirement

        // Generate random attendance: 0, 1, or 2
        int empCheck = (int) (Math.random() * 3);

        int workingHours = 0;

        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present (Full-Time)");
            workingHours = FULL_DAY_HOURS;

        } else if (empCheck == IS_PART_TIME) {
            System.out.println("Employee is Present (Part-Time)");
            workingHours = PART_TIME_HOURS;

        } else {
            System.out.println("Employee is Absent");
            workingHours = 0;
        }

        int dailyWage = workingHours * WAGE_PER_HOUR;
        System.out.println("Daily Employee Wage = " + dailyWage);
    }
}

