
import java.util.Scanner;

public class Problem_8 {
    public static void checkArrayElements(int size){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int length = size /2;
        for(int i = 0; i < length; i++){
            if (arr[i] != arr[length - 1 - i]){
                System.out.println("Its not a palindrome array");
                break;
            }else{
                 System.out.println("its Palindrome");
                 break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        checkArrayElements(size);
    }
}
