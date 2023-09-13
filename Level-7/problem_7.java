import java.util.Scanner;

public class problem_7 {
    public static void primeOrNot(int number){
    int  flag = 1;
    for (int i = 2; i <= number / 2; ++i) {
      if (number % i == 0) {
        flag = 0;
        break;
      }
    }
    if (flag == 1)
      System.out.println(number + " is a prime number.");
    else
      System.out.println(number + " is not a prime number.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        primeOrNot(n);
    }
}
