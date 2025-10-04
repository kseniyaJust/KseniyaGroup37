package HomeWork14.methodic;

import java.util.HashSet;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        //1
//        Scanner scanner = new Scanner(System.in);
//        HashSet<Integer> numberCollection = new HashSet<Integer>();
//        int inputNumber = 2;
//        System.out.println("Enter numbers (0 to exit): ");
//        while(inputNumber != 0){
//            inputNumber = scanner.nextInt();
//            numberCollection.add(inputNumber);
//        }
//        System.out.println(numberCollection);
//        scanner.close();
//        System.out.println("----------------------------------------END OF TASK 1\n");
        //2
        System.out.println("Animals: ");
        NamesOfAnimals namesCollection = new NamesOfAnimals(new String[]{"cat","dog","giraffe"});
        namesCollection.showCollection();

        namesCollection.addAnimal("hippo");
        namesCollection.showCollection();

        namesCollection.removeAnimal();
        namesCollection.removeAnimal("cat");
        namesCollection.showCollection();
        System.out.println("----------------------------------------END OF TASK 2\n");

        //3
        RegulateStudents regulateStudents = new RegulateStudents(new Student[]{
                new Student("Alex",1235,2,2),
                new Student("Kate",1234,4,5),
                new Student("Boris",1236,3,8),
                new Student("Ann",1233,1,9)
        });
        regulateStudents.regulate();
        System.out.print("Students on 4th course: ");
        regulateStudents.printStudents(4);
        System.out.print("Students on 2nd course: ");
        regulateStudents.printStudents(2);
        System.out.println("----------------------------------------END OF TASK 3\n");

        //*
        CustomCollection<Integer> myCollection = new CustomCollection<>();
        myCollection.add(1);
        myCollection.add(2);
        myCollection.add(3);
        myCollection.add(4); // должен выделить больше памяти под этот элемент

        System.out.println("Adding elements " + myCollection);

        myCollection.remove();
        System.out.println("With removed element " + myCollection);

        System.out.println("Index 1: "+ myCollection.find(1));
        System.out.println("If exists "+myCollection.isExists(5) );
        myCollection.clear();
        System.out.println("----------------------------------------END OF TASKS");

    }
}
/* Задача 1: Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например,
"1,2,3,4,4,5". Избавиться от повторяющихся элементов в строке. Вынести результат на экран

Задача 2: Создать класс, который будет хранить в себе коллекцию с названиями животных.
Реализовать методы удаления и добавления животных по следующим правилам: добавляется всегда в начало коллекции а удаляется всегда из конца.
Показать работу объекта этого класса в main методе другого класса

Задача 3: Создать класс Student содержащий следующие характеристики - имя, группа , курс, оценки по предметам.
Создать коллекцию, содержащую объекты класса Student. Написать метод, который удаляет студентов со средним баллом меньше 3.
Если средний балл больше 3 студент переводится на следующий курс. Дополнительно написать метод printStudents(List<Student> students, int course),
который получает список студентов и номер курса. А также  печатает на консоль имена тех студентов из списка, которые обучаются
на данном курсе

Задача *:
Представим, что в Java нет коллекции типа ArrayList. Создать свой класс, симулирующий
работу класса динамической коллекции - т.е. создать свою кастомную коллекцию. В
основе коллекции будет массив. Кастомная коллекция должна хранить элементы разных
классов(т.е. это generic).
Предусмотреть операции(методы):
1. добавления элемента
2. удаления элемента
3. получение элемента по индексу
4. проверка есть ли элемент в коллекции
5. очистка всей коллекции
Предусмотреть конструктор без параметров - создает массив размером
по умолчанию. Предусмотреть конструктор с задаваемым размером внутреннего
массива. Предусмотреть возможность автоматического расширения коллекции при
добавлении элемента в том случае, когда коллекция уже заполнена.
* */