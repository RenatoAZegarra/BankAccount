public class Test {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        // Deposit money into account1
        account1.deposit(500, "checking");
        account1.deposit(1000, "savings");

        // Deposit money into account2
        account2.deposit(200, "checking");

        // Withdraw money from account1
        account1.withdraw(200, "checking");

        // Withdraw money from account2
        account2.withdraw(150, "checking");

        // Print the balances of account1 and account2
        System.out.println("Account 1 - Checking Balance: " + account1.getCheckingBalance());
        System.out.println("Account 1 - Savings Balance: " + account1.getSavingsBalance());
        System.out.println("Account 2 - Checking Balance: " + account2.getCheckingBalance());

        // Print the total amount stored in all accounts and the number of accounts created
        System.out.println("Total Amount in all Accounts: " + account1.getTotalAmount());
        System.out.println("Number of Accounts: " + BankAccount.getNumOfAccounts());

        // Print the account numbers of account1 and account2
        System.out.println("Account 1 - Account Number: " + account1.getAccountNumber());
        System.out.println("Account 2 - Account Number: " + account2.getAccountNumber());
    }
}