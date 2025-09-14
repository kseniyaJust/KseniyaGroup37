package Homework8.methodic.Employees;

public class SalariedEmployee extends Employee {
    int salary;

    public SalariedEmployee(int id, String name, int salary) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    public float calculateSalary() {
        return salary + salary * 0.2f;
    }
}
