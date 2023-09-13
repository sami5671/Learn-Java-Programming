import java.util.Scanner;

public class Problem_8 {
    public static void checkArrayElements(int size){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        boolean isPalindrome = true;
        for(int i = 0; i < size / 2; i++){
            if (arr[i] != arr[size - 1 - i]){
                isPalindrome = false; 
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println("it is  a palindrome array");
        } else {
            System.out.println("it is not a palindrome array");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        checkArrayElements(size);
    }
}
