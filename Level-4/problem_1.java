import java.util.Scanner;

public class problem_1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int product = num1*num2;

        System.out.println("Sum IS: "+sum);
        System.out.println("Product is: "+product);

    }
}
