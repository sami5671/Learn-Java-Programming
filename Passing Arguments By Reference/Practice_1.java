
public class Practice_1 {
    private static void change(point p){
        p.x = 2;
        p.y = 1; 
    }
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 1;
        p1.y = 2;
        System.out.println(" " + p1 + " " + p1.y);
    }
}
