public class problem2c {
    
        public static void main(String[] args) {
            int n = 4; // Number of rows
    
            for (int i = n; i >= 1; i--) {
                // Print leading spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
    
                // Print the pattern (1s and 0s)
                for (int j = 1; j <= 2 * i - 1; j++) {
                    if (j % 2 == 0) {
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }
                }
    
                // Move to the next line
                System.out.println();
            }
        
    }
    
}
