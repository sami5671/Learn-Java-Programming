public class problem_13 {
    public static void main(String[] args) {
        int number =56789;
        int first = number %10;
        int temp1 = number/10;
        int second = temp1 %10;

       
        System.out.println(first);    
        System.out.println(second);
        
        int sum = temp1 + second;
         System.out.println(sum);
    }
}
