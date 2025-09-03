package HomeWork6.lesson;

import java.util.Objects;
import java.util.Scanner;

//TODO: методы с маленькой буквы
//TODO: CTRL+ALT+L
public class Classes {


    public static void main(String[] args) {
        //1. Создай класс Car с полями brand, year, и методом startEngine(), который выводит "Двигатель запущен".
        //2. Добавь в класс Car конструктор, который принимает brand и year как параметры.
        // Создай в main два объекта этого класса с разными значениями.
        Car car1 = new Car("BMW", 2010);
        Car car2 = new Car("Audi", 2020);

        car1.startEngine();
        car2.startEngine();

        //3. Задача: Метод с параметром
        //Добавь в класс Car метод drive(int distance), который выводит сообщение типа: "Автомобиль проехал 150 км".
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите расстояние ");
        int dist = scanner.nextInt();
        car1.drive(dist);
        car2.drive(dist*10);
        System.out.println("----------------------------END OF CAR");

        //4. Задача: Взаимодействие объектов
        //Создай класс Player и класс Weapon. Каждый игрок может взять оружие, которое имеет name и damage.
        //Добавь метод attack() в Player, который выводит: “Игрок атакует с [name], нанося [damage] урона.”
        System.out.println("Введите имя пользователя ");
        String playerName = scanner.next();

        Weapon weaponGun = new Weapon("Винтовка", 5);
        Player player = new Player(playerName,weaponGun);

        player.attack();
        System.out.println("-----------------------------END OF PLAYER");

        //5. Задача: Мини-симуляция
        //Класс Elevator, с полем currentFloor, и методами goUp(), goDown(), goToFloor(int floor).
        //Добавь проверку: не подниматься выше 10 этажа и не опускаться ниже 1.
        System.out.println("Введите стартовый этаж ");
        int floor = scanner.nextInt();
        if(floor >0 &&floor<11){
            Elevator elevator = new Elevator(floor);
            String action = " ";

            while (!Objects.equals(action, "/")){
                System.out.println("Вы на " + elevator.getCurrentFloor());
                System.out.println("Введите команду (+ - вверх, -(минус) - вниз, цифра - конкретный этаж, / - выход)");
                action = scanner.next();
                try{
                    floor = Integer.parseInt(action);
                    elevator.goToFloor(floor);
                }
                catch (NumberFormatException e){
                    switch (action){
                        case "+" -> elevator.goUp();
                        case "-"-> elevator.goDown();
                    }
                }
            }
        }
        scanner.close();

    }
}

//1-3
class Car {
    private String brand;
    private int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void startEngine() {
        if(year <60)
            System.out.println("Двигатель " + brand + " " + year + " запущен");
        else
            System.out.println("Двигатель " + brand + " " + year + " НЕ запущен");
    }

    public void drive(int distance) {
        System.out.println("Автомобиль " + brand + " проехал " + distance + " км");
    }
}

//4
class Player {
    private final String playerName;
    private  Weapon weapon;
    Player(String playerName,Weapon weapon) {
        this.playerName = playerName;
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon.getWeaponName() != null && weapon.getDamage() != 0) {
            System.out.println(playerName + " атакует с " + weapon.getWeaponName() +
                    ", нанося " + weapon.getDamage() + " урона");
        }
    }

}

class Weapon {
    private String weaponName;
    private int damage;

    Weapon(String weaponName, int damage) {
        this.weaponName = weaponName;
        this.damage = damage;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public int getDamage() {
        return damage;
    }
}

//5
class Elevator {
    private int currentFloor;

    Elevator(int currentFloor){
        this.currentFloor = currentFloor;
    }
    public int getCurrentFloor() {
        return currentFloor;
    }

    public void goUp(){
        if(currentFloor>9){
            System.out.println("Это последний этаж");
            return;
        }
        currentFloor++;
    }
    public void goDown(){
        if(currentFloor<2){
            System.out.println("Это нижний этаж");
            return;
        }
        --currentFloor;
    }
    public void goToFloor(int changeToFloor){
        currentFloor = changeToFloor;
    }
}