public class doctor {
    String DocName;
    int DocID;
    double DocSalary;

    // Here is the constructor
    doctor(String name, int id, double salary){
        this.DocName = name;
        this.DocID = id;
        this.DocSalary = salary;
    }
    // its just a method for printing the doctor details information
    void display(){
        System.out.println("Doctor ID: "+DocID);
        System.out.println("Doctor Name: "+DocName);
        System.out.println("Doctor Salary: "+DocSalary);
    }
    public static void main(String[] args) {
        // passing arguments inside the object (after creating)
        doctor obj1 = new doctor("rahim", 222, 9000.99);
        doctor obj2 = new doctor("Karim", 444, 84300.99);

        // calling the function (display)
        obj1.display();
        System.out.println("Second Doctor details:-----");
        obj2.display();
    }
}
