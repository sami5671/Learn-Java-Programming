
public class CurrentAccount extends BankAccount {
    
    public CurrentAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }

    // deposit method 
    public void deposit(double amount){
        setBalance(getBalance()+ amount);
        System.out.println("Deposit Amount: "+ " " + amount + " " + "Current Balance: "+ getBalance());
    }

    // withdraw method
    public void withdraw(double amount) {
        if (getBalance()>= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw amount: " + amount + " "+ " "+getBalance());
        }else{
            System.out.println("tk nai");
        }
    }
}
