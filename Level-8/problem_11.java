import java.util.Scanner;

public class problem_11{


    public static void main(String[] args) {
        int array[] = {10,12,20,30,25,40,32,31,35,50,60};
        int startingIndex = 3;
        int endIndex = 8;

        int subLength = endIndex - startingIndex+1;
        int subArray[] = new int[subLength];

        for(int i = 0; i < subLength; i++){
            subArray[i] = array[startingIndex+i];
        }
        System.out.println("Sub array from index "+startingIndex + " to " + endIndex + " is: ");
        for(int i : subArray){
            System.out.println(i + " ");
        }
    }
}