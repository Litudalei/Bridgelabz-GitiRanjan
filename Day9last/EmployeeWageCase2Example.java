package Day9last;
class EmployeeWageCase2Example {

    public static void main(String[] args) {

        int WAGE_PER_HOUR = 20;
        int FULL_TIME = 8;
        int PART_TIME = 4;

        int totalDays = 0;
        int totalHours = 0;

        while (totalDays < 20 && totalHours < 100) {

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

        System.out.println("Total Working Days = " + totalDays);
        System.out.println("Total Working Hours = " + totalHours);
        System.out.println("Total Wage Earned = " + totalWage);
    }
}

