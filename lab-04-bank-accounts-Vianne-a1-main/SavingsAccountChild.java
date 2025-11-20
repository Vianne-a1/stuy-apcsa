class SavingsAccountChild extends SavingsAccount {
    private String parentName;

    public SavingsAccountChild(String name, double initialDeposit, double interestRate, String parentName) throws Exception {
        super(name, initialDeposit, interestRate);
        if (parentName.length() < 3) {
            throw new Exception("Parent/guardian name must have at least 3 characters.");
        }
        this.parentName = parentName;
    }

    public void withdraw(double amount, String parentName) throws Exception {
        if (!parentName.equals(this.parentName)) {
            throw new Exception("Withdrawal restricted. Parent/guardian name does not match.");
        }
        super.withdraw(amount);
    }
}
