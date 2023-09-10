public class problem3 {
    public static void main(String[] args) {
        int n = 4; // Number of rows for the pattern

        for (int i = n; i >= 1; i--) {
            // Print 1
            System.out.print("1");

            // Print 0's
            for (int j = 1; j <= i - 2; j++) {
                System.out.print("0");
            }

            // Print 1
            System.out.print("1");
            
            System.out.println();
        }
    } 
}

