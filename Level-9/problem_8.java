import java.util.Scanner;

public class problem_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String inputText = sc.nextLine();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        inputText = inputText.toLowerCase(); 

        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            }
        }

        System.out.println("No. of Vowels: " + vowels);
        System.out.println("No. of Consonants: " + consonants);
        System.out.println("No. of Digits: " + digits);
        System.out.println("No. of White spaces: " + spaces);
    }
}
