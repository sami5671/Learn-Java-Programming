import java.util.Scanner;
public class problem_16 {
    public static void main(String[] args) {
        int number = 123;

        int a = number % 10;
        int b = (number / 10)%10;
        int c = number /100;

        int reverse = a*100 + b*10+ c;
        System.out.println(reverse);
    }
}
