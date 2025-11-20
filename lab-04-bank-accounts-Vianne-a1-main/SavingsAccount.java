class SavingsAccount extends BankAccount {
    private double interestRate;
    private int withdrawCount;

    public SavingsAccount(String name, double initialDeposit, double interestRate) throws Exception {
        super(name, initialDeposit);
        if (interestRate < 0) {
            throw new Exception("Interest rate cannot be negative.");
        }
        this.interestRate = interestRate;
        this.withdrawCount = 0;
    }

    public void addInterest() throws Exception {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if (withdrawCount >= 6) {
            throw new Exception("Exceeded maximum withdrawal limit for this account.");
        }
        super.withdraw(amount);
        withdrawCount++;
    }

    public int getWithdrawCount() {
        return withdrawCount;
    }
}