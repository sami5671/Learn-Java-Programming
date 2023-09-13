import java.util.Scanner;

public class problem_9 {
    public static void split(int size){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[size];
        int middle = size / 2;

        int arr1[] = new int[middle];
        int arr2[] = new int[size - middle];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < middle; i++){
            arr1[i] = arr[i];
        }

        for(int i = middle; i < size; i++){
            arr2[i - middle] = arr[i];
        }

       
        System.out.println("First array elements are: ");
        for(int i = 0; i < middle; i++){
            System.out.println(arr1[i]);
        }

       
         System.out.println("Second array elements are: ");
        for(int i = 0; i < size - middle; i++){
            System.out.println(arr2[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        split(size);
    }
}
