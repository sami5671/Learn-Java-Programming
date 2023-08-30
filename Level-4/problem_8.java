import java.util.Scanner;
public class problem_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        boolean all_equal = (num1 == num2 && num2 == num3);
        boolean two_equal = (num1 == num2) || (num2 == num3) || (num1 == num3);

        System.out.println(all_equal);
        System.out.println(two_equal);
            
        
    }
}
