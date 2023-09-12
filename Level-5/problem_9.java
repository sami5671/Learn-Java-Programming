import java.util.Scanner;

public class problem_9 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of classes held: ");
        int totalClass = sc.nextInt();
        System.out.print("Enter the number of classes attended: ");
        int ClassAtt = sc.nextInt();

        double percentage = (double)(ClassAtt / totalClass * 100);

        System.out.println("The percentage of classes attended is " + percentage + "%");

        System.out.print("Do you have a medical cause? (Y/N): ");
        char medicalCause = sc.next().charAt(0);

        if (medicalCause == 'Y' || medicalCause == 'y') {
            System.out.println("You have a medical cause. You are allowed to sit.");
        } else {
            if (percentage >= 75) {
                System.out.println("You are allowed to sit.");
            } else {
                System.out.println("You are not allowed to sit.");
            }
    }
}
}
