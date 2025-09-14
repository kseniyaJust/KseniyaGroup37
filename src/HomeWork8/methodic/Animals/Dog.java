package HomeWork8.methodic.Animals;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("BARK BARK");
    }

    @Override
    public void move() {
        System.out.println("Dog running...");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating meat...");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeping...");
    }
}
