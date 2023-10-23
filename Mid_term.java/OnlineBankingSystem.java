import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false; // Insufficient balance
        }
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double calculateInterest() {
        return getBalance() * interestRate / 100.0;
    }
}

class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, double overdraftLimit) {
        super(accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}

class Transaction {
    private int transactionID;
    private String transactionType;
    private double amount;
    private Date date;

    public Transaction(int transactionID, String transactionType, double amount, Date date) {
        this.transactionID = transactionID;
        this.transactionType = transactionType;
        this.amount = amount;
        this.date = date;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }
}

class Customer {
    private int customerID;
    private String name;
    private List<Account> accounts;
    private List<Transaction> transactions;

    public Customer(int customerID, String name) {
        this.customerID = customerID;
        this.name = name;
        this.accounts = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void createAccount(Account account) {
        accounts.add(account);
    }

    public boolean performTransaction(Account account, String transactionType, double amount) {
        if (account != null) {
            Transaction transaction = new Transaction(transactions.size() + 1, transactionType, amount, new Date());
            transactions.add(transaction);

            if (transactionType.equals("Deposit")) {
                account.deposit(amount);
            } else if (transactionType.equals("Withdrawal")) {
                boolean success = account.withdraw(amount);
                if (!success) {
                    transactions.remove(transaction);
                    return false; // Transaction failed (insufficient balance)
                }
            }
            return true; // Transaction successful
        }
        return false; // Account not found
    }

    public List<Transaction> viewTransactions() {
        return transactions;
    }
}

public class OnlineBankingSystem {
    public static void main(String[] args) {
        // Sample usage of the Online Banking System
        Customer customer = new Customer(1, "John Doe");
        SavingsAccount savingsAccount = new SavingsAccount(101, 2.5);
        CheckingAccount checkingAccount = new CheckingAccount(201, 1000);

        customer.createAccount(savingsAccount);
        customer.createAccount(checkingAccount);

        customer.performTransaction(savingsAccount, "Deposit", 1000);
        customer.performTransaction(checkingAccount, "Deposit", 500);

        customer.performTransaction(savingsAccount, "Withdrawal", 200);
        customer.performTransaction(checkingAccount, "Withdrawal", 700);

        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());
        System.out.println("Checking Account Balance: $" + checkingAccount.getBalance());

        System.out.println("Savings Account Interest: $" + savingsAccount.calculateInterest());

        List<Transaction> transactions = customer.viewTransactions();
        System.out.println("\nTransaction History:");
        for (Transaction transaction : transactions) {
            System.out.println("Transaction ID: " + transaction.getTransactionID());
            System.out.println("Type: " + transaction.getTransactionType());
            System.out.println("Amount: $" + transaction.getAmount());
            System.out.println("Date: " + transaction.getDate());
            System.out.println();
        }
    }
}
