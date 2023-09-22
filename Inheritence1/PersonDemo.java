public class PersonDemo {
    public static void main(String[] args) {
        Person p = new Person("Grace", "Lee");
        Student s = new Student("Jeffery", "Long", 2021);
        Teacher t = new Teacher("sami", "alam", "computer science Engineering");

        System.out.println(p);
        System.out.println(s);
        System.out.println(t);

t.setLastName("hello");

        System.out.println(p.getGreeting());
        System.out.println(s.getGreeting());
        System.out.println(t.getGreeting());
    }

    // set 
    // t.setLastName("hello world");
    
}
