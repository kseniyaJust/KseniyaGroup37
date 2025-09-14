package HomeWork9.methodic;

public class Tiger extends Animal {

    Tiger(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("GRRRRRR");
    }

    @Override
    public void eat(String food) {
        food = food.toLowerCase();
        if (food.equals("meat")) {
            System.out.println(name + " is delighted");
        } else {
            System.out.println(name + " is shocked");
        }
    }
}
