import java.text.DecimalFormat;

public class problem_11 {
        private static final DecimalFormat df = new DecimalFormat("0.000");
    public static void main(String[] args) {
        double fahrenheit = 108;
        double Celsius = (fahrenheit - 32) * 5/9;
        System.out.println("temp: "+ df.format(Celsius));
    }
}
