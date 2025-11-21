package comday11part2;
public class Account {

    private double balance;

     
    public Account(double balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }

   
    public double getBalance() {
        return balance;
    }

     
    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    
    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance.");
        } else if (amount > 0) {
            balance -= amount;
        }
    }
}

