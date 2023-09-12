import java.util.Scanner;

public class problem_6 {
    public static void circle(double radius){
        double area = 3.1416 * (radius * radius);
        double circumference = 2*3.1416*radius;

        System.out.println("Area: "+area);
        System.out.println("Circumference: "+circumference);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = sc.nextDouble();
        circle(radius);
    }
}
