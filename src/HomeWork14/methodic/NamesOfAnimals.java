package HomeWork14.methodic;

import java.util.Arrays;
import java.util.LinkedList;

public class NamesOfAnimals {
    LinkedList<String> namesCollection;

    NamesOfAnimals() {
        namesCollection = new LinkedList<String>();
    }

    NamesOfAnimals(String... names) {
        namesCollection = new LinkedList<String>();
        namesCollection.addAll(Arrays.asList(names));
    }

    public void addAnimal(String name) {
        namesCollection.addFirst(name);
    }

    public void removeAnimal() {
        namesCollection.removeLast();
    }

    public void removeAnimal(String name) {
        namesCollection.remove(name);
    }

    public void showCollection() {
        System.out.println(namesCollection);
    }
}
