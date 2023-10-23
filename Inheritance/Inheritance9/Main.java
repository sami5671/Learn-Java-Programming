// The protected member of a class can be accessed:

// Within the same class.
// Derived classes of same packages.
// Different classes of the same packages.
// Derived classes of different packages.


public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.MethodA();
        obj.MethodB();
        obj.MethodC();
    }
}

