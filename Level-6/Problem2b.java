// import java.util.Scanner;
public class Problem2b {
    public static void main(String[] args) {
        int n = 3; // Change n to adjust the size of the pattern

        // Print the increasing part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        // Print the decreasing part
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}



