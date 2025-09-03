package Homework7.methodicks;

import java.lang.reflect.Field;
import java.util.Scanner;

public class MainDZ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name ");
        String name = scanner.next();
        System.out.print("Enter healing plan ");
        int plan = scanner.nextInt();

        Patient patient = new Patient(name,plan);
        Therapist therapist = new Therapist();
        therapist.appointDoctor(patient);
        System.out.println("-----------------------------------end clinic");
        scanner.close();
        //2 яблоко
        //решила использовать рефлексию
        System.out.println("Apple ");
        Apple apple = new Apple();
        System.out.println(apple.getColor());
        try{
            //использую класс Field поскольку заранее неизвестно что будет за тип у поля
            Field color = apple.getClass().getDeclaredField("color"); //получаю из основного класса поле по имени с помощью метода getDeclaredField
            color.setAccessible(true); //делаю поле private доступным для изменения
            color.set(apple,(String)"green"); //задаю переменной новое значение
        }catch (NoSuchFieldException | IllegalAccessException k){ //обрабатываю исключения которые могут возникнуть при работе
            System.out.println("Error");
        }
        System.out.println(apple.getColor());


    }
}
