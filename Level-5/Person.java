import java.util.Scanner;

public class Person {
   
    private int age = 90;

    public Person(){
    Scanner sc = new Scanner(System.in);
    age = sc.nextInt();
    sc.close();
    }

    public void sayAge(){
    System.out.println("my age is: "+ age);
    }
}

