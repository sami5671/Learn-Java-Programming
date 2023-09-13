
    import java.util.Arrays;
import java.util.Scanner;
    public class problem_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int maxV1 = arr[0];
        int maxV2 = arr[n-1];

        int maxDifference = maxV1 - maxV2;


        int minDifference = Integer.MAX_VALUE;

        int minV1 = 0;
        int minV2 = 0;

        for(int i = 1; i < n; i++){
            int difference = arr[i] - arr[i-1];
            if (difference < minDifference) {
                minDifference = difference;
                minV1 = arr[i-1];
                minV2 = arr[i];
            }
        }
System.out.println("Pair with maximum difference: "+maxV1 + " and " + maxV2 + " with difference: "+ maxDifference);
System.out.println("Pair with minimum difference: "+minV1 + " and " + minV2 + " with difference: "+minDifference);
    }
}

