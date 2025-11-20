package Day10Part3;

public class CompanyEmpWage {

    public String companyName;
    public int empRatePerHour;
    public int maxWorkingDays;
    public int maxWorkingHours;
    public int totalWage;

    public CompanyEmpWage(String companyName, int empRatePerHour,
                          int maxWorkingDays, int maxWorkingHours) {

        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public String toString() {
        return "Total Wage for Company " + companyName + " is: ₹" + totalWage;
    }
}



