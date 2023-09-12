import java.util.Scanner;
public class problem_2 {

    public static void evenOrOdd(int number){
        if (number % 2== 0) {
            System.out.println("The number is Even " +number);
        }else{
            System.out.println("The number is Odd " +number);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        evenOrOdd(number);
    }
}
