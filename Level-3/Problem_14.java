public class Problem_14 {

    
    public static void main(String[] args) {

        int originalNumber = 5696;
    int digit1 = (originalNumber % 10000) / 1000; // Extract the thousands digit
            int digit2 = (originalNumber % 1000) / 100;   // Extract the hundreds digit
            int digit3 = (originalNumber % 100) / 10;     // Extract the tens digit
            int digit4 = originalNumber % 10;            // Extract the units digit

         
            digit1 = (digit1 + 2) % 10;
            digit2 = (digit2 + 2) % 10;
            digit3 = (digit3 + 2) % 10;
            digit4 = (digit4 + 2) % 10;

           
            int newNumber = digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4;


            System.out.println(newNumber);
}
}
