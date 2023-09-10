import java.util.Scanner;
public class oldest_youngest_p_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int age_1 = sc.nextInt();
        int age_2 = sc.nextInt();
        int age_3 = sc.nextInt();

        if(age_1>age_2 && age_1>age_3){
            System.out.println("Person 1 is oldest:" +age_1);
        }
        else if(age_2>age_1 && age_2>age_3){
            System.out.println("Person 2 is oldest:" +age_2);
        }
        else if(age_3>age_1 && age_3>age_2){
            System.out.println("Person 3 is oldest:" +age_3);
        }

        if(age_1<age_2 && age_1<age_3){
            System.out.println("Person 1 is youngest:" +age_1);
        }
        else if(age_2<age_1 && age_2<age_3){
            System.out.println("Person 2 is youngest:" +age_2);
        }
        else if(age_3<age_1 && age_3<age_2){
            System.out.println("Person 3 is youngest:" +age_3);
        }
    }
}
