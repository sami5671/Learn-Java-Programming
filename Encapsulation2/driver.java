public class driver {
    public static void main(String[] args) {
        Student s1 = new Student("sami", 23, 444);

        System.out.println("Name: "+s1.getName());
        System.out.println("age: "+s1.getAge());
        System.out.println("roll: "+s1.getRollNumber());

        s1.setName("rony");
        s1.setAge(20);
        s1.setRollNumber(20);

        System.out.println("Name: "+s1.getName());
        System.out.println("age: "+s1.getAge());
        System.out.println("roll: "+s1.getRollNumber());

    }
}
