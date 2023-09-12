import java.util.Scanner;

public class problem_7 {

    public static void largestAndSmallest(int size){
        Scanner sc = new Scanner(System.in);
        int array[] = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        int min = array[0];
        int max = array[0];

        for(int i = 0; i < size; i++){
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Min: "+min);
        System.out.println("max: "+max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();
        largestAndSmallest(size);
    }
}
