package Day10Part4;
import java.util.*;

public class EmpWageBuilder implements EmpWageInterface {

    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;

    private ArrayList<CompanyEmpWage> companyList = new ArrayList<>();
    private Map<String, CompanyEmpWage> companyMap = new HashMap<>();

    @Override
    public void addCompany(String name, int rate, int days, int hours) {

        CompanyEmpWage company = new CompanyEmpWage(name, rate, days, hours);

        companyList.add(company);
        companyMap.put(name, company);
    }

    @Override
    public void computeWages() {

        for (CompanyEmpWage company : companyList) {
            int totalWage = computeCompanyWage(company);
            company.setTotalWage(totalWage);
            System.out.println(company);
        }
    }

    // Compute wage for each company
    private int computeCompanyWage(CompanyEmpWage company) {

        int totalHours = 0;
        int totalDays = 0;
        int empHours = 0;
        Random random = new Random();

        while (totalHours < company.maxWorkingHours &&
               totalDays < company.maxWorkingDays) {

            totalDays++;

            int empCheck = random.nextInt(3);  // 0,1,2

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

            // Stop exceeding max hours
            if (totalHours + empHours > company.maxWorkingHours) {
                empHours = company.maxWorkingHours - totalHours;
            }

            totalHours += empHours;

            // Calculate daily wage and store in list
            int dailyWage = empHours * company.empRatePerHour;
            company.dailyWageList.add(dailyWage);
        }

        return totalHours * company.empRatePerHour;
    }

    // Query total wage by company name
    @Override
    public int getTotalWage(String companyName) {
        CompanyEmpWage company = companyMap.get(companyName);
        return (company == null) ? -1 : company.totalWage;
    }


    // MAIN METHOD
    public static void main(String[] args) {

        EmpWageBuilder builder = new EmpWageBuilder();

        builder.addCompany("TCS", 20, 20, 100);
        builder.addCompany("Infosys", 25, 22, 120);
        builder.addCompany("Wipro", 18, 26, 110);

        builder.computeWages();

        // Query total wage
        System.out.println("Total Wage for Infosys = ₹" + builder.getTotalWage("Infosys"));
    }
}

