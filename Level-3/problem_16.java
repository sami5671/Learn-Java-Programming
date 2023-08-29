public interface problem_16 {
    public static void main(String[] args) {

        int number = 123;
        int digit1 = number % 10;
        number = number / 10;
        int digit2 = number % 10;
        number = number / 10;
        int digit3 = number % 10;
       

        int sum = digit1 + digit2 + digit3;
        System.out.println(+sum);
    }
}
