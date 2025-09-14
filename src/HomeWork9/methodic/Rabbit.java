package HomeWork9.methodic;

public class Rabbit extends Animal{

    Rabbit(String name){
        super(name);
    }
    @Override
    public void voice(){
        System.out.println("SHSHSHSHSH");
    }

    @Override
    public void eat(String food) {
        food = food.toLowerCase();
        if (food.equals("grass")){
            System.out.println( name + " is delighted");
        }
        else{
            System.out.println(name+ " is shocked");
        }
    }
}
