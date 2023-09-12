
import java.util.Scanner;
public class problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String givenWord = "Hello, World";
        System.out.println("Enter two characters: ");
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();

        int first = givenWord.indexOf(text1);
        int Second = givenWord.indexOf(text2);
        
        System.out.println("First character at Index: "+first);
        System.out.println("Second character at Index: "+Second);
    }
}
