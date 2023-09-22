

public class Student extends Person{
    protected int yearOfGraduation;

    public Student(String firstName, String lastName, int yearOfGraduation){
        super(firstName, lastName);
        this.yearOfGraduation = yearOfGraduation;
    }
    public String toString(){
        return "Student: " + firstName + " " + lastName + " - " + yearOfGraduation;
    }
    // create getter / setter for yearOfGraduation
}