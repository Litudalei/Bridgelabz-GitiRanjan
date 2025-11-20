package com;
public class DailyWage {
    public static void main(String[] args) {

        // Attendance constants
        final int IS_PRESENT = 1;

        // Wage and work hour constants
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS = 8;

        // Random attendance check (0 or 1)
        int empCheck = (int) (Math.random() * 2);

        if (empCheck == IS_PRESENT) {
            // Employee present → calculate daily wage
            int dailyWage = FULL_DAY_HOURS * WAGE_PER_HOUR;
            System.out.println("Employee is Present");
            System.out.println("Daily Wage = " + dailyWage);
        } else {
            // Employee absent
            System.out.println("Employee is Absent");
            System.out.println("Daily Wage = 0");
        }
    }
}

