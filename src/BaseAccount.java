

    public abstract class BaseAccount implements IAccount {
        protected int accountNumber;
        protected double balance;
        protected double creditLimit; 

        // Constructor with account number and credit limit
        public BaseAccount(int accountNumber, double creditLimit) {
            this.accountNumber = accountNumber;
            // Ensuring credit limit is negative or zero
            this.creditLimit = Math.min(creditLimit, 0);
            this.balance = 0; // Initial balance is set to zero
        }
        @Override
        public void Deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            } else {
              System.out.println("Cannot deposit negative number");  // Handle error: Cannot deposit negative amount
            }
        }
        @Override
        public double GetCurrentBalance() {
            return balance;
        }

        
        @Override
        public int GetAccountNumber() {
            return accountNumber;
        }
    }
