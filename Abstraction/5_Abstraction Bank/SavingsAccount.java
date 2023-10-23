
public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }
    
    public void deposit(double amount){
        setBalance(amount + getBalance());
        System.out.println("you have deposited: "+ amount + " "+ "current balance: "+ " "+ getBalance());
    } 

    public void withdraw(double amount){
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw: "+amount+ " " + "current balance: "+ " "+getBalance());
        }else{
            System.out.println("balance nai");
        }
    }
}
