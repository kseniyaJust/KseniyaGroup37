package Homework8.methodic.Employees;

public class HourlyEmployee extends Employee{
    float moneyperHour;
    float hours;

    public HourlyEmployee(int id,String name,float moneyperHour,float hours) {
        super(id,name);
        this.moneyperHour = moneyperHour;
        this.hours = hours;
    }

    @Override
    public float calculateSalary() {
        return hours*moneyperHour*22;
    }
}
