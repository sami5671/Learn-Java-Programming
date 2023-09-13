
    import java.util.Scanner;
    public class problem_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your first name: ");
        String firstName = sc.nextLine();
        System.out.println("enter your middle name: ");
        String middleName = sc.nextLine();
        System.out.println("enter your last name: ");
        String lastName = sc.nextLine();


        System.out.println("The abbreviation of your name is: " + firstName.charAt(0)+"." + middleName.charAt(0)
        + "."   + lastName);
        

        sc.close();
    }
}
