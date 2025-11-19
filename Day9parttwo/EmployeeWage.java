package Day9parttwo;
import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        
        // Constants
        final int WAGE_PER_HOUR = 20;
        final int FULL_TIME = 1;
        final int PART_TIME = 2;

        // Random attendance (0,1,2)
        Random random = new Random();
        int empCheck = random.nextInt(3); // 0,1,2
        
        int empHours = 0;

        switch (empCheck) {
            case FULL_TIME:
                System.out.println("Employee is Present (Full Time)");
                empHours = 8;
                break;

            case PART_TIME:
                System.out.println("Employee is Present (Part Time)");
                empHours = 4;  // Part-time can be 4 hours (OR 8 if you want)
                break;

            default:
                System.out.println("Employee is Absent");
                empHours = 0;
        }

        int dailyWage = empHours * WAGE_PER_HOUR;
        System.out.println("Employee Wage for Today = " + dailyWage);
    }
}

