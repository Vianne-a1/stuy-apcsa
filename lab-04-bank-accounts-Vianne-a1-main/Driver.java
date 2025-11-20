public class Driver {
    public static void main(String[] args) {
        System.out.println("Case #1");
        try {
            CheckingAccount checkingAccount = new CheckingAccount("John", 1000);
            System.out.println("Checking Account Balance: " + checkingAccount.getBalance());

            SavingsAccount savingsAccount = new SavingsAccount("Jane", 5000, 0.05);
            System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
            savingsAccount.addInterest();
            System.out.println("After interest: " + savingsAccount.getBalance());

            SavingsAccountChild childAccount = new SavingsAccountChild("Child", 2000, 0.03, "Parent");
            System.out.println("Child Account Balance: " + childAccount.getBalance());
            childAccount.withdraw(500, "Parent");
            System.out.println("After withdrawal: " + childAccount.getBalance());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Case #2");
        try {
            // Test CheckingAccount
            CheckingAccount checkingAccount = new CheckingAccount("John", 1000);
            System.out.println("Checking Account Balance: " + checkingAccount.getBalance());

            // Test SavingsAccount
            SavingsAccount savingsAccount = new SavingsAccount("Jane", 5000, 0.05);
            System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
            savingsAccount.addInterest();
            System.out.println("After interest: " + savingsAccount.getBalance());

            // Test withdrawal limit in SavingsAccount
            System.out.println("Withdraw count: " + savingsAccount.getWithdrawCount());
            savingsAccount.withdraw(500);
            System.out.println("After withdrawal: " + savingsAccount.getBalance());
            System.out.println("Withdraw count: " + savingsAccount.getWithdrawCount());
            savingsAccount.withdraw(200);
            System.out.println("After second withdrawal: " + savingsAccount.getBalance());
            System.out.println("Withdraw count: " + savingsAccount.getWithdrawCount());

            // Attempt to exceed withdrawal limit in SavingsAccount
            for (int i = 0; i < 5; i++) {
                savingsAccount.withdraw(100);
            }
            System.out.println("Withdraw count: " + savingsAccount.getWithdrawCount());

            // Test SavingsAccountChild
            SavingsAccountChild childAccount = new SavingsAccountChild("Child", 2000, 0.03, "Parent");
            System.out.println("Child Account Balance: " + childAccount.getBalance());

            try {
                childAccount.withdraw(500, "WrongParent");
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
            }

            childAccount.withdraw(500, "Parent");
            System.out.println("After withdrawal: " + childAccount.getBalance());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Case #3");
        try {
            // Test CheckingAccount
            CheckingAccount checkingAccount = new CheckingAccount("John", 1000);
            System.out.println("Checking Account Balance: " + checkingAccount.getBalance());

            // Test deposit and withdrawal in CheckingAccount
            checkingAccount.deposit(500);
            System.out.println("After deposit: " + checkingAccount.getBalance());
            checkingAccount.withdraw(200);
            System.out.println("After withdrawal: " + checkingAccount.getBalance());

            // Test SavingsAccount
            SavingsAccount savingsAccount = new SavingsAccount("Jane", 5000, 0.05);
            System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

            // Attempt to withdraw from SavingsAccount with insufficient balance
            try {
                savingsAccount.withdraw(6000);
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
            }

            // Test withdrawal and interest in SavingsAccount
            savingsAccount.withdraw(2000);
            System.out.println("After withdrawal: " + savingsAccount.getBalance());
            savingsAccount.addInterest();
            System.out.println("After interest: " + savingsAccount.getBalance());

            // Test SavingsAccountChild
            SavingsAccountChild childAccount = new SavingsAccountChild("Child", 2000, 0.03, "Parent");
            System.out.println("Child Account Balance: " + childAccount.getBalance());

            // Attempt to withdraw from SavingsAccountChild with incorrect parentName
            try {
                childAccount.withdraw(500, "WrongParent");
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
