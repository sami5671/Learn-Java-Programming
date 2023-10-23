
public class Main {
    public static void main(String[] args) {
        SavingsAccount sv = new SavingsAccount();
        CurrentAccount cv = new CurrentAccount();

        sv.deposit();
        sv.withdraw();

System.out.println("--------------------------------------------------------");

        cv.deposit();
        cv.withdraw();
    }
}
