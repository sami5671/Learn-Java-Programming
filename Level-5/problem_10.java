import java.util.Scanner;
public class problem_10 {
    public static void main(String[] args) {
        int x= 2;
        int y= 5;
        int z= 0;

        if (x == 2) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        if (x!=6) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        if (x!=5 && y>=5) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        if (z!= 0 || x== 2) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        if (!(y<10)) {
            System.out.println("True");
        }else{
            System.out.println("false");
        }
    }
}
