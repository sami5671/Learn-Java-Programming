import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number: ");
       int n = sc.nextInt();
       tryNumber(n);

    }

    public static void tryNumber(int n){
        try {
         checkEvenNumber(n);
          System.out.println(n + " is a even number");
        }
        catch (Exception err) {
            System.out.println("error: " + err.getMessage());
        }
    }

    public static void checkEvenNumber(int number){
             if (number % 2 != 0) {
               throw new IllegalArgumentException("number is not even");
          }
    }
}
