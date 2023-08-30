import java.util.Scanner;
public class problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();

        double areaOfSide = side * side;
        double perimeter = 4*side;

        System.out.println(+perimeter);
        System.out.println(+areaOfSide);
        sc.close();
    } 
}
