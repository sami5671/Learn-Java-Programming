import java.util.Scanner;


public class problem_1 {
public static void findMax(double n1, double n2, double n3) {
    double max = Math.max(Math.max(n1, n2), n3);
    System.out.println("Max: "+max);
    }
public static void findMin(double n1, double n2, double n3) {
    double min = Math.min(Math.min(n1, n2), n3);
    System.out.println("Min: "+min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        findMax(num1, num2, num3);
        findMin(num1, num2, num3);

       
    }
}
