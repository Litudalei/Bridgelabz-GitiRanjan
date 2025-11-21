package comday11part2;

public class AccountTest {

    public static void main(String[] args) {

        Account account = new Account(5000);

        System.out.println("Initial Balance: " + account.getBalance());

        
        account.debit(2000);
        System.out.println("Balance after debit(2000): " + account.getBalance());

        
        account.debit(4000); // Greater than balance
        System.out.println("Balance after debit(4000): " + account.getBalance());
    }
}

