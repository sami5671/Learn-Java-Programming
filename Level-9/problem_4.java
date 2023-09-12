import java.util.Scanner;
public class problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String givenWord = "Umbrella";
        System.out.println("Enter the text(e):");
        String text = sc.nextLine();
        if (givenWord.contains(text)) {
            System.out.println(text + " is present");
        }else{
            System.out.println(text + " is not present");
        }
    }
}
