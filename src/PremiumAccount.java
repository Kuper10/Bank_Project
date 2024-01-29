public class PremiumAccount extends BaseAccount {

    public PremiumAccount(int accountNumber) {
        super(accountNumber,0);

            }


    @Override
    public double Withdraw(double amount) {
        if (amount > 0) {
           balance-=amount;
           return amount;

        } else {
            // Handle error: Cannot withdraw negative amount
            return 0;
        }

    }


}

