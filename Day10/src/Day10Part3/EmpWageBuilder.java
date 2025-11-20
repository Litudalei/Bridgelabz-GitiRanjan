package Day10Part3;

import java.util.*;

public class EmpWageBuilder {

    private ArrayList<CompanyEmpWage> companyList = new ArrayList<>();
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;

    
    public void addCompany(String companyName, int rate, int days, int hours) {
        CompanyEmpWage company = new CompanyEmpWage(companyName, rate, days, hours);
        companyList.add(company);
    }

    
    public void computeWages() {
        for (CompanyEmpWage company : companyList) {
            int totalWage = computeWage(company);
            company.setTotalWage(totalWage);
            System.out.println(company);
        }
    }

   
    private int computeWage(CompanyEmpWage company) {

        int totalHours = 0;
        int totalDays = 0;
        int empHours = 0;

        Random random = new Random();

        
        while (totalHours < company.maxWorkingHours &&
               totalDays < company.maxWorkingDays) {

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

            
            if (totalHours + empHours > company.maxWorkingHours) {
                empHours = company.maxWorkingHours - totalHours;
            }

            totalHours += empHours;
        }

        return totalHours * company.empRatePerHour;
    }

    public static void main(String[] args) {

        EmpWageBuilder builder = new EmpWageBuilder();

        // Add multiple companies
        builder.addCompany("TCS", 20, 20, 100);
        builder.addCompany("Infosys", 25, 22, 120);
        builder.addCompany("Wipro", 18, 24, 110);

        // Compute all wages
        builder.computeWages();
    }
}
