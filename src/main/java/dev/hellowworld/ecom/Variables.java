package dev.ecommerce.helloworld;

public class Variables {

    public void pupAge() {
        // this local variable
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }
    // this instance/class variable is visible for any child class.
    public String name;
    // salary  variable is visible in Employee class only.
    private double salary;

    // The name variable is assigned in the constructor.
    public Variables(String empName) {
        this.name = empName;
    }

    // The salary variable is assigned a value.
    public void setSalary(double empSal) {
        this.salary = empSal;
    }

    // This method prints the employee details.
    public void printEmp() {
        System.out.println("name  : " + name);
        System.out.println("salary :" + salary);
    }
    // salary  variable is a private static variable
    private static double empSalary;

    // DEPARTMENT is a constant
    public static final String DEPARTMENT = "Development ";

    public static void main(String args[]) {
        Variables empOne = new Variables("Ransika");
        empOne.setSalary(1000);
        empOne.printEmp();
        empOne.pupAge();
        empSalary = 9000;
        System.out.println(DEPARTMENT + "average salary:" + empSalary);
    }
}
