import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
Scanner sc = new Scanner (System.in);
// int value = sc.nextInt();

while (true) {
        Scanner userInput = new Scanner (System.in);
        double initalBalanceSavings = 1000, initalBalanceCurrent = 5000;

        SavingsAccount sa = new SavingsAccount("sami", initalBalanceSavings);
        System.out.println("Initial balance In SAVINGS ACCOUNT: "+initalBalanceSavings);
        System.out.println("----------------------------------------------------------------");
        CurrentAccount ca = new CurrentAccount("Jon", initalBalanceCurrent);
        System.out.println("Initial balance In CURRENT ACCOUNT: "+initalBalanceCurrent);

        System.out.println("Enter the choice(1/2): 1. Savings Account\t 2. Current Account");
        int choice = userInput.nextInt();

    switch (choice) {
            case 1:
        System.out.println("-------------SAVING ACCOUNT-------------");
        System.out.println("Enter the amount (deposit and withdraw: )");
                Scanner depositS = new Scanner(System.in);
                double depositAmountS = depositS.nextDouble();
                Scanner withdrawS = new Scanner(System.in);
                double withdrawAmountS = withdrawS.nextDouble();

                sa.deposit(depositAmountS);
                sa.withdraw(withdrawAmountS);
                break;

            case 2:
        System.out.println("-------------CURRENT ACCOUNT-------------");
        System.out.println("Enter the amount (deposit and withdraw: )");
                Scanner depositC = new Scanner(System.in);
                double depositAmountC = depositC.nextDouble();
                Scanner withdrawC = new Scanner(System.in);
                double withdrawAmountC = withdrawC.nextDouble();

                ca.deposit(depositAmountC);
                ca.withdraw(withdrawAmountC);
                break;
            default:
        System.out.println("Invalid choice");
                break;
        }
        System.out.println("Do you want more transaction? If yes enter(1-~) any integer value. IF No enter(0)");
        if (sc.nextInt() == 0) {
            return;
        }
    }
    }
}
