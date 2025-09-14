package Homework8.methodic.Animals;


public class Bird implements Animal{
    @Override
    public void makeSound() {
        System.out.println("QUIRk QUIRK");
    }

    @Override
    public void move() {
        System.out.println("Bird flying...");
    }

    @Override
    public void eat() {
        System.out.println("Bird eating seeds...");
    }

    @Override
    public void sleep() {
        System.out.println("Bird sleeping...");
    }
}
