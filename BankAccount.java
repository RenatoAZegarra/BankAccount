import java.util.Random;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numOfAccounts = 0;
    private static double totalAmountStored = 0;
    private String accountNumber;

    public BankAccount() {
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        numOfAccounts++;
        accountNumber = generateAccountNumber();
    }

    // Getter for checking balance
    public double getCheckingBalance() {
        return checkingBalance;
    }

    // Getter for savings balance
    public double getSavingsBalance() {
        return savingsBalance;
    }

    // Method to deposit money into a specific account type
    public void deposit(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            checkingBalance += amount;
        } else if (accountType.equalsIgnoreCase("savings")) {
            savingsBalance += amount;
        }
        totalAmountStored += amount;
    }

    // Method to withdraw money from a specific account type
    public void withdraw(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            if (amount <= checkingBalance) {
                checkingBalance -= amount;
                totalAmountStored -= amount;
            } else {
                System.out.println("Insufficient funds in checking account.");
            }
        } else if (accountType.equalsIgnoreCase("savings")) {
            if (amount <= savingsBalance) {
                savingsBalance -= amount;
                totalAmountStored -= amount;
            } else {
                System.out.println("Insufficient funds in savings account.");
            }
        }
    }

    // Method to get the total amount stored in both checking and savings accounts
    public double getTotalAmount() {
        return checkingBalance + savingsBalance;
    }

    // Getter for the number of accounts created
    public static int getNumOfAccounts() {
        return numOfAccounts;
    }

    // Getter for the total amount stored in all accounts
    public static double getTotalAmountStored() {
        return totalAmountStored;
    }

    // Private method to generate a random 10-digit account number
    private String generateAccountNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    // Getter for the account number
    public String getAccountNumber() {
        return accountNumber;
    }
}