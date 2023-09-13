import java.util.Scanner;

public class problem_1 {
    public static void array(int size){
        Scanner sc = new Scanner(System.in);
        int array[] = new int[size];
        for(int i = 0; i<size; i++){
        array[i] = sc.nextInt();
        }
        System.out.println("The array is: ");
        for(int i = 0; i<size; i++){
        System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        array(size);
    }
}
