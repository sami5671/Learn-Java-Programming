import java.util.Scanner;

public class problem_9 {
    public static void Split(int size){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[size];
        int middle = size / 2;

        int arr1[] = new int[middle];
        int arr2[] = new int[size -middle];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        // Spliting array into two different arrays
        for(int i=0; i<middle; i++){
            arr1[i] = arr[i];
        }

        for(int i=middle; i<size; i++){
            arr2[i - middle] = arr1[i];
        }
        // printing
        for(int i=0; i< middle; i++){
            System.out.println("First: "+arr1[i]);
        }
        for(int i=0; i< middle; i++){
            System.out.println("Second: "+arr2[i]);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Split(size);
    }
}
