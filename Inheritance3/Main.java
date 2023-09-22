//  implement multi-level inheritance
public class Main {
    public static void main(String[] args) {
        Derived2 obj = new Derived2();
        obj.BaseMethod();
        obj.Derived1Method();
        obj.Derived2Method();
    }
}
