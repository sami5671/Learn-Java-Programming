import java.util.Scanner;

public class problem_4 {
    public static void arrayCopy(int size) {
        Scanner sc = new Scanner(System.in);
        int array_1[] = new int[size];
        int array_2[] = new int[size];

        for (int i = 0; i < size; i++) {
            array_1[i] = sc.nextInt();
        }

        // COPY ARRAY AND REVERSE ORDER
        for (int i = 0; i < size; i++) {
            array_2[i] = array_1[size - 1 - i]; // Corrected to reverse the array
        }

        System.out.println("Reversed array: ");
        for (int i = 0; i < size; i++) {
            System.out.println(array_2[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        arrayCopy(size);
    }
}
