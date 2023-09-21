import java.util.Scanner;
public class Practice_3 {
    public static String getName(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        return name;
       }
       public static double getAge(){
        return new Scanner(System.in).nextDouble();
       }
    public static void main(String[] args) {
        System.out.println("Enter your name & Age: "); 
        System.out.println(getName() + " " + getAge());
    }
}
