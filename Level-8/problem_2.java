import java.util.Scanner;
public class problem_2 {
    public static void findArrayElement(int size){
        Scanner sc = new Scanner(System.in);
        int array[] = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Please Enter a number that you want to search: ");
        int searchValue = sc.nextInt();
        for(int i = 0; i < size; i++){
            if (array[i] == searchValue) {
                System.out.println("searchValue is present: "+searchValue);
                break;
            }else{
                System.out.println(+searchValue +" searchValue is not present: ");
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        findArrayElement(size);
    }
}
