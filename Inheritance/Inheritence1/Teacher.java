

public class Teacher extends Person {
    protected String department;

    public Teacher(String firstName, String lastName, String department){
        super(firstName, lastName);
        this.department = department;
    }
    public String getGreeting(){
        return "Hi, I'm Teacher: " + lastName + "  ";
    }
    public String toString(){
        return "Teacher:  " + firstName + " " + lastName + " - " + department;
    }
    // create setter and getter for department 
}
