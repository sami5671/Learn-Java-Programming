import java.util.Scanner;
public class Problem_5 {
    public static void product(double a, double b){
        double product = a * b;
        System.out.println("Product: " + product);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        product(num1, num2);
    }
}
