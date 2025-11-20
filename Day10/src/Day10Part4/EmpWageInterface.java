package Day10Part4;
public interface EmpWageInterface {
    public void addCompany(String name, int rate, int days, int hours);
    public void computeWages();
    public int getTotalWage(String companyName);
}

