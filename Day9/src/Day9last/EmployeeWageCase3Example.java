package Day9last;
class EmployeeWageCase3Example {

    // Class Variables
    static final int WAGE_PER_HOUR = 20;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;
    static final int FULL_TIME = 8;
    static final int PART_TIME = 4;

    // Class Method
    public static int computeEmployeeWage() {

        int totalDays = 0;
        int totalHours = 0;

        while (totalDays < MAX_WORKING_DAYS && totalHours < MAX_WORKING_HOURS) {

            totalDays++;

            int empCheck = (int) (Math.random() * 3);
            int empHrs = 0;

            switch (empCheck) {
                case 1: empHrs = PART_TIME; break;
                case 2: empHrs = FULL_TIME; break;
                default: empHrs = 0;
            }

            totalHours += empHrs;
        }

        int totalWage = totalHours * WAGE_PER_HOUR;

        System.out.println("----- Employee Wage Computation -----");
        System.out.println("Total Working Days: " + totalDays);
        System.out.println("Total Working Hours: " + totalHours);
        System.out.println("Total Monthly Wage: " + totalWage);

        return totalWage;  // returning is optional
    }

    public static void main(String[] args) {
        computeEmployeeWage();  // calling class method
    }
}
