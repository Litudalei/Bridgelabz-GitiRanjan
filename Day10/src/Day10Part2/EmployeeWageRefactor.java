package Day10Part2;

import java.util.Random;

public class EmployeeWageRefactor {

    // Constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int MAX_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS = 100;

    // Method to compute employee wage
    public void computeWage() {

        int totalHours = 0;
        int totalDays = 0;
        int empHours = 0;

        Random random = new Random();

        while (totalHours < MAX_WORKING_HOURS && totalDays < MAX_WORKING_DAYS) {

            totalDays++;

            int empCheck = random.nextInt(3); // 0,1,2

            switch (empCheck) {
                case IS_FULL_TIME:
                    empHours = 8;
                    break;

                case IS_PART_TIME:
                    empHours = 4;
                    break;

                default:
                    empHours = 0;
            }

            // Ensure total hours do not exceed limit
            if (totalHours + empHours > MAX_WORKING_HOURS) {
                empHours = MAX_WORKING_HOURS - totalHours;
            }

            totalHours += empHours;

            System.out.println("Day " + totalDays + " => Worked Hours: " + empHours);
        }

        int totalWage = totalHours * EMP_RATE_PER_HOUR;

        System.out.println("----------------------------------");
        System.out.println("Total Worked Days : " + totalDays);
        System.out.println("Total Worked Hours: " + totalHours);
        System.out.println("Total Monthly Wage: ₹" + totalWage);
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        EmployeeWageRefactor emp = new EmployeeWageRefactor();
        emp.computeWage();
    }
}

