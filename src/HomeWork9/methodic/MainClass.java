package HomeWork9.methodic;


import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    //Задача 1:
    //Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
    //Переопределить методы voice(), eat(String food) чтобы они выводили верную
    //информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
    //Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
    //туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
    //или другую строку то он будет недоволен.

    //Задача *:
//Написать такой конструктор, который запретит создание объекта класса Dog в других
//классах; Найти способ вызывать методы voice(), eat() класса Dog, который позволит
//обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
//способа.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter animal (1 - dog, 2 - tiger, other - rabbit)");
        try{
            int number = scanner.nextInt();
            Animal animal;
            switch (number){
                case 1 ->animal = Dog.createDog("dog"); //создание объекта не через конструктор а через метод
                case 2 ->animal = new Tiger("tiger");
                default ->animal = new Rabbit("rabbit");
            }
            animal.voice();
            System.out.println("Feed your animal (without whitespaces): ");
            String inputFood = scanner.next();
            animal.eat(inputFood);
        }catch (InputMismatchException r){
            System.out.println("I need number");
        }
        scanner.close();


    }
}



