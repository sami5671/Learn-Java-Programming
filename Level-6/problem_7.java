import java.util.Scanner;
public class problem_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int product = 1;
        int sum = 0;
        int count = 0;
        int number;
        while(true){
            String str = sc.next();
            
            if (str.equals("q")) {
                break;
            }

            number = Integer.parseInt(str);
            sum = sum+number;
            product = product * number;
            count++;

            System.out.println("Sum: "+sum);
            System.out.println("Average: "+(sum/(double)count));
            System.out.println("Product: "+product);
            
            System.out.println("To exit the system press q");
        }
    }
}
