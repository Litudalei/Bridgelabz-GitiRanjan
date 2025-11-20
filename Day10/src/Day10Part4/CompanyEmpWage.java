package Day10Part4;

import java.util.ArrayList;

public class CompanyEmpWage {

    public String companyName;
    public int empRatePerHour;
    public int maxWorkingDays;
    public int maxWorkingHours;

    public int totalWage;
    public ArrayList<Integer> dailyWageList = new ArrayList<>();

    public CompanyEmpWage(String name, int rate, int days, int hours) {
        this.companyName = name;
        this.empRatePerHour = rate;
        this.maxWorkingDays = days;
        this.maxWorkingHours = hours;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    @Override
    public String toString() {
        return "Company: " + companyName + 
               " | Total Wage: ₹" + totalWage +
               " | Daily Wages: " + dailyWageList;
    }
}

