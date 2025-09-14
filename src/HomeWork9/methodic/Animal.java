package HomeWork9.methodic;

public abstract class Animal{
    String name;

    Animal(String name){
        this.name = name;
    }
    public abstract void voice();

    public abstract void eat(String food);
}