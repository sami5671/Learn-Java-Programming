
public class Exception1 {
    public static void main(String[] args) {
        try {
            int result = divideNumber(5,0);
            System.out.println("Result: "+result);
        }
        catch (Exception err) {
            System.out.println("Error: "+err.getMessage());
        }
    }
    public static int divideNumber(int dividend, int divisor) {
    if (divisor == 0) {
        throw new ArithmeticException("can not divide number");
    }
    return dividend / divisor;
}
}


