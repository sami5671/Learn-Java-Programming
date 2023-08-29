import java.util.Scanner;
public class problem_3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double num1 = scanner.nextDouble();
    double num2 = scanner.nextDouble();

    double area = num1 * num2;
    int areaInt = (int)area;

    System.out.println("Area: "+areaInt);
    }
   


}
