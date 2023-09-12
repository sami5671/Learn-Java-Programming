import java.util.Scanner;
public class problem_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = num1 + num2; 
        int product = num1* num2;

        int sumAndProduct = sum + product;

        System.out.println("sumAndProduct: "+sumAndProduct);
    }
}
