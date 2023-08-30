
import java.util.Scanner;
public class problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        if (length == breadth) {
            System.out.println("Square");
        }else{
             System.out.println("Not Square");
        }

    }
}
