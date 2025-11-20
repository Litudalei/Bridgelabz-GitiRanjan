package com;
public class Attendance {
    public static void main(String[] args) {

        // Constants
        final int IS_PRESENT = 1;

        // Generate random attendance: 0 or 1
        int empCheck = (int) (Math.random() * 2); 

        if (empCheck == IS_PRESENT) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}

