import java.util.Scanner;
public class problem_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sub1 = sc.nextInt();
        double sub2 = sc.nextInt();
        double sub3 = sc.nextInt();

        double total = sub1 + sub2 + sub3;
        double percentage = (total / 300)*100;

        System.out.println("total: "+total);
        System.out.println("percentage: "+percentage+"%");

    }
}
