package Day9last;

class EmployeeWageCase1Example {

    public static void main(String[] args) {

        int WAGE_PER_HOUR = 20;
        int FULL_TIME = 8;
        int PART_TIME = 4;
        int totalWage = 0;

        for (int day = 1; day <= 20; day++) {
            int empCheck = (int) (Math.random() * 3);  // 0,1,2
            int empHrs = 0;

            switch (empCheck) {
                case 1: empHrs = PART_TIME; break;
                case 2: empHrs = FULL_TIME; break;
                default: empHrs = 0;
            }

            totalWage += empHrs * WAGE_PER_HOUR;
        }

        System.out.println("Total Employee Wage for 20 Days = " + totalWage);
    }
}
