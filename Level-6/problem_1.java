import java.util.Scanner;
public class problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, num, average;
        for(int i = 0; i < 10; i++) {
         num = sc.nextInt();
         sum = sum + num;
    }
    average = sum /10;
    System.out.println("Average: "+average);
}
}

