public class problem_13 {
    public static void main(String[] args) {
        int number = 56789;
        int fDigit = number / 10000; 
        int sLDigit = (number / 10) % 10;
        int sum = fDigit + sLDigit;
       
        System.out.println(fDigit);    
        System.out.println(sLDigit);
        System.out.println(+sum);
       
    }
}
