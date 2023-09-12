import java.util.Scanner;
public class problem_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Str = sc.nextLine();
        char ch = Str.charAt(0);


        if (Character.isUpperCase(ch)) {
            System.out.println("Uppercase");
        }else{
            System.out.println("Lowercase");
        }

    }
}
