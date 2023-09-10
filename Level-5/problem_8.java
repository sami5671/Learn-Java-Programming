import java.util.Scanner;
public class problem_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of classes held: ");
        System.out.print("Enter the number of classes attended: ");
        int totalClass = sc.nextInt();
        int ClassAtt = sc.nextInt();

        double percentage = (double)(ClassAtt / totalClass * 100);

        System.out.println("The percentage of classes attended is " + percentage + "%");

    }
}
