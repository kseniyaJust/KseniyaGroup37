package HomeWork8.methodic.Employees;

//2. Абстрактный класс Employee с полями name, id, методом displayInfo() и абстрактным методом calculateSalary().
//Наследники: SalariedEmployee(Штатный сотрудник), HourlyEmployee(Почасовой сотрудник), CommissionEmployee(Комиссионный сотрудник).
// Добавить поля по необходимости.
//Показать зарплату каждого сотрудника в Main.
public abstract class Employee {
    String name;
    int id;

    public Employee(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo(float employeeSalary) {
        System.out.println("Employee " + id + " " + name + "'s salary: " + employeeSalary);
    }

    public abstract float calculateSalary();
}

