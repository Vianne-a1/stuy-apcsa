abstract class BankAccount implements BankAccountInterface {
    private String name;
    private double balance;

    public BankAccount(String name, double initialDeposit) throws Exception {
        if (name.length() < 3) {
            throw new Exception("Name must have at least 3 characters.");
        }
        if (initialDeposit <= 0) {
            throw new Exception("Initial deposit must be greater than zero.");
        }
        this.name = name;
        this.balance = initialDeposit;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void deposit(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Deposit amount must be greater than zero.");
        }
        balance += amount;
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if (amount <= 0 || amount > balance) {
            throw new Exception("Invalid withdrawal amount.");
        }
        balance -= amount;
    }

    @Override
    public void transfer(double amount, BankAccount destination) throws Exception {
        if (amount <= 0 || amount > balance) {
            throw new Exception("Invalid transfer amount.");
        }
        destination.deposit(amount);
        withdraw(amount);
    }}