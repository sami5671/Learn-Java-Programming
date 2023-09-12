import java.util.Scanner;

public class problem_4 {
    public static void sum(double a, double b){
        double sum = a + b;
        System.out.println("SUM IS: "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        sum(num1, num2);
    }
}
