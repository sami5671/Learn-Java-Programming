import java.util.Scanner;
public class problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String givenWord = "This is orange juice";
        System.out.println("Enter the text: ");
        String text = sc.nextLine();

        if(givenWord.contains(text)){
        System.out.println(text+" is present");

        }else{
          System.out.println(text + " is not present");
        }
    }
}
