package Day10Part2;
import java.util.Random;

public class EmployeeWageComputation {

    // Constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {

        int empHours = 0;
        int empWage = 0;

        // Random object to generate 0,1,2
        Random random = new Random();
        int empCheck = random.nextInt(3);  // generates 0,1,2

        switch (empCheck) {

            case IS_FULL_TIME:
                System.out.println("Employee is Present (Full-time)");
                empHours = 8;
                break;

            case IS_PART_TIME:
                System.out.println("Employee is Present (Part-time)");
                empHours = 4;
                break;

            default:
                System.out.println("Employee is Absent");
                empHours = 0;
        }

        // Calculate Daily Wage
        empWage = empHours * EMP_RATE_PER_HOUR;

        System.out.println("Employee Worked Hours: " + empHours);
        System.out.println("Daily Employee Wage: ₹" + empWage);
    }
}
