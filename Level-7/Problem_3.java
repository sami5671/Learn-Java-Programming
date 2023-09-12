import java.util.Scanner;
public class Problem_3 {
    public static void eligibleForVote(int age){
        if (age >= 18) {
            System.out.println("Eligible for vote");
        }else{
            System.out.println("Not eligible for vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        eligibleForVote(age);
    }
}
