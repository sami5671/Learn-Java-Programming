import java.util.Scanner;
public class problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        int yearsOfExperience = sc.nextInt();

        if (yearsOfExperience > 5) {
            double SalaryImplement = salary * .05;
            double SalaryIncreased = SalaryImplement + salary;
            System.out.println("Net bonus amount: "+SalaryIncreased);
        }else{
            System.out.println("Will not get any bonus amount(under 5 years)");
        }
        
    }
}
