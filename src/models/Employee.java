package models;

public class Employee extends Person {


    private double salary;
    private String position;

    public Employee() {}
    public Employee(String firstName, String lastName, String position, double salary) {
        super(firstName, lastName);
        this.position = position;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
}
