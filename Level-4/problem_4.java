import java.util.Scanner;

public class problem_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your name: ");
        String name = scanner.nextLine();
        System.out.print("enter your field: ");
        String field = scanner.nextLine();
        System.out.print("enter your roll: ");
        int roll = scanner.nextInt();

        // System.out.println("my name is: "+name);
        // System.out.println("my roll is: "+roll);
        // System.out.println("my field is: "+field);

        System.out.println("my name: "+name+ "\n" + "my roll: "+roll+ "\n"+ "my field is: "+field);
    }
}
