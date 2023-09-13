
import java.util.Scanner;
public class problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String givenWord = "Hello, World";

        int zeroFirst = givenWord.indexOf('o');
        int zeroLast = givenWord.lastIndexOf('o');

        int commaFirst = givenWord.indexOf(',');
        int commaLast = givenWord.lastIndexOf(',');

        System.out.println("\nFirst occurrence of 'o' is at index: " + zeroFirst + ", and Last occurrence of 'o' is at index: " + zeroLast);

        System.out.println("First occurrence of ',' is at index: " + commaFirst + ", and Last occurrence of ',' is at index: " + commaLast);
    }
}
