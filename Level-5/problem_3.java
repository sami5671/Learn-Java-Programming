import java.util.Scanner;
public class problem_3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       double Quantity = sc.nextDouble();

       if (Quantity>= 1000) {
        double discount = Quantity*.01;
        double totalCost = Quantity-discount;
        System.out.println("Total Cost: "+totalCost);
       }
    }
}
