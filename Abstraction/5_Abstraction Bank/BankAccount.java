
abstract class BankAccount {
    
    String accountNumber;
    double balance;

    // constructor
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // getter
    public String getAccountNumber(){
        return accountNumber;
    }
    public Double getBalance(){
        return balance;
    }

    // setter 
    protected void setBalance(double balance){
       this.balance = balance;
    }


    abstract void deposit(double amount);
    abstract void withdraw(double amount);

}
