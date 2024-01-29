
public class StandardAccount extends BaseAccount {

       // Constructor with account number and credit limit
    public StandardAccount(int accountNumber, double creditLimit) {
        super(accountNumber, creditLimit);

    }


    // Withdraw method checks against credit limit
    @Override
    public double Withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return 0;
        }

        double effectiveWithdrawal = Math.min(amount, balance - creditLimit);
        balance -= effectiveWithdrawal;
        return effectiveWithdrawal;
    }

    // Returns current balance
}
