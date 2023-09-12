import java.util.Scanner;
public class problem_5 {
    public static void sumAndProduct(int size){
        Scanner sc = new Scanner(System.in);
        int array[] = new int[size];
        int sum = 0;
        int product = 1;
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < size; i++){
            sum = sum + array[i];
            product = product*array[i];
        }
        System.out.println("SUM: "+sum);
        System.out.println("PRODUCT: "+product);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();
        sumAndProduct(size);
    }
}
