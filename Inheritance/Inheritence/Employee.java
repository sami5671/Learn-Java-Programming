public class Employee {
    private String name;
    private String address;
    private String jobTitle;
    private double salary;

// make a  constructor 
    public Employee(String name, String address, String jobTitle, double salary){
        this.name = name;
        this.address = address;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public double getSalary(){
        return salary;
    }

    public double calculateBonus(){
        return 0.0;
    }
}
