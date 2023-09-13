import java.util.Scanner;

public class problem_9 {
    public static void factorial(int n){
        int fact = 1;
        for(int i = 1; i<n; i++){
            fact = fact *i;
        }
        System.out.println("Factorial is: "+fact);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        factorial(n);
    }
}
