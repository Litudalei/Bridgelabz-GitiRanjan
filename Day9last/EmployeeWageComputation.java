package Day9last;
class EmployeeWageComputation {

    // Class method that calculates wage using function parameters only
    public static int computeWage(String company, int wagePerHour, int maxWorkingDays, int maxWorkingHrs) {

        int totalHrs = 0;
        int totalDays = 0;

        while (totalDays < maxWorkingDays && totalHrs < maxWorkingHrs) {
            totalDays++;

            int empCheck = (int) (Math.random() * 3);  // 0 = Absent, 1 = Part-time, 2 = Full-time
            int empHrs = 0;

            switch (empCheck) {
                case 1: empHrs = 4; break;  // Part-time
                case 2: empHrs = 8; break;  // Full-time
                default: empHrs = 0;        // Absent
            }

            totalHrs += empHrs;
        }

        int totalWage = totalHrs * wagePerHour;

        System.out.println("Company: " + company);
        System.out.println(" - Total Working Days: " + totalDays);
        System.out.println(" - Total Hours Worked: " + totalHrs);
        System.out.println(" - Total Wage: " + totalWage);
        System.out.println("------------------------------------");

        return totalWage;
    }

    public static void main(String[] args) {

        // Compute wage for multiple companies using method parameters
        computeWage("TCS", 20, 20, 100);
        computeWage("Infosys", 25, 22, 120);
        computeWage("Amazon", 30, 26, 140);
    }
}

