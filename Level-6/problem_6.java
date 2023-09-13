
    import java.util.Scanner;
    public class problem_6 {
        public static int findGCD(int a, int b) {
            int gcd = 1;
            for (int i = 1; i <= a && i <= b; i++) {
              if (a % i == 0 && b % i == 0)
                gcd = i;
            }
            return gcd;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int gcd = findGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
    
}
