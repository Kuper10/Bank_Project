public class BasicAccount extends BaseAccount {

         private double withdrawalLimit; // Maximum amount that can be withdrawn in a single transaction

        // Constructor with account number and withdrawal limit
        public BasicAccount(int accountNumber, double withdrawalLimit) {
            super(accountNumber,0);
            this.withdrawalLimit = Math.max(withdrawalLimit, 0); // Ensure withdrawal limit is positive
                      }


        @Override
        public double Withdraw(double amount) {
                if (amount <= 0) {
                        System.out.println("Withdrawal amount must be positive.");
                        return 0;
                }

                double actualWithdrawal = Math.min(amount, Math.min(withdrawalLimit, balance));
                balance -= actualWithdrawal;
                return actualWithdrawal;
        }

}
