import java.util.Scanner;
public class p_7_absolute_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double doubleValue = sc.nextDouble();
        System.out.println(Math.abs(doubleValue));
        
    }
}
