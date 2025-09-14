package Homework8.methodic;

import Homework8.methodic.Animals.Animal;
import Homework8.methodic.Animals.Bird;
import Homework8.methodic.Animals.Dog;
import Homework8.methodic.Employees.CommissionEmployee;
import Homework8.methodic.Employees.HourlyEmployee;
import Homework8.methodic.Employees.SalariedEmployee;

import java.util.Scanner;

public class ClassForCallMethodicMethods {
    public static void main(String[] args) {
        //Employees
        SalariedEmployee salariedEmployee = new SalariedEmployee(1, "Vika", 1000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee(2, "Sergey", 5.5f, 8);
        CommissionEmployee commissionEmployee = new CommissionEmployee(3, "Natalia", 100, 10);

        salariedEmployee.displayInfo(salariedEmployee.calculateSalary());
        hourlyEmployee.displayInfo(hourlyEmployee.calculateSalary());
        commissionEmployee.displayInfo(commissionEmployee.calculateSalary());
        System.out.println("--------------------- END OF EMPLOYEES");
        //Animals
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your animal (1 - dog, other - bird)");
        int numberAnimal = scanner.nextInt();
        Animal animal;
        if (numberAnimal == 1)
            animal = new Dog();
        else
            animal = new Bird();
        System.out.println("Enter action (1 - sound, 2 - move, 3 - eat, 4 - sleep, 0 - end)");
        int numberAction = scanner.nextInt();
        while (numberAction != 0) {
            switch (numberAction) {
                case 1 -> animal.makeSound();
                case 2 -> animal.move();
                case 3 -> animal.eat();
                case 4 -> animal.sleep();
            }
            System.out.println("Enter action (1 - sound, 2 - move, 3 - eat, 4 - sleep, 0 - end)");
            numberAction = scanner.nextInt();
        }
        System.out.println("--------------------- END OF ANIMALS");
        scanner.close();
        System.out.println("END OF TASKS");
    }
}
