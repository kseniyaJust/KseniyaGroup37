package HomeWork9.methodic;

public class Dog extends Animal{

    //конструктор приватен, поэтому теперь вне класса объект не создашь
     private Dog(String name){
        super(name);
    }
    @Override
    public void voice(){
        System.out.println("BARK BARK");

    }

    @Override
    public void eat(String food) {
        food = food.toLowerCase();
        if (food.equals("dogfood")){
            System.out.println( name + " is delighted");
        }
        else{
            System.out.println(name+ " is shocked");
        }
    }
    //метод для создания объекта Dog
    public static Dog createDog(String name){
         return new Dog(name);
    }
}
