import java.util.Scanner;
public class problem_3 {
    public static void findValue(int size){
        Scanner sc = new Scanner(System.in);
        int array[] = new int[size];
        System.out.println("Enter the array Elements: ");
        int positiveNumber = 0;
        int negativeNumber = 0;
        int evenNumber = 0;
        int OddNumber = 0;
        int Zero = 0;

        for(int i = 0; i<size; i++){
        array[i] = sc.nextInt();

        if (array[i] > 0 ) {
        positiveNumber++;
        }
        else if (array[i] < 0) {
        negativeNumber++;
        }
        else{
        Zero++;
        }

        if (array[i] %2 == 0) {
        evenNumber++;
        }
        else{
        OddNumber++;   
       }

    }
    System.out.println("Number of positive numbers: " + positiveNumber);
    System.out.println("Number of negative numbers: " + negativeNumber);
    System.out.println("Number of odd numbers: " + OddNumber);
    System.out.println("Number of even numbers: " + evenNumber);
    System.out.println("Number of zeros: " + Zero);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 20;
        findValue(size);
    }
}
