public class Employee extends Person {
    int emp_id;
    int emp_salary;

    Employee(int emp_id, int emp_salary, int age, String name){
        super(name, age);
        this.emp_id = emp_id;
        this.emp_salary = emp_salary;
    }
    void printEmployeeDetails(){
        System.out.println("Employee ID: "+emp_id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Age: "+age);
        System.out.println("Employee Salary: "+emp_salary);

    }
}
