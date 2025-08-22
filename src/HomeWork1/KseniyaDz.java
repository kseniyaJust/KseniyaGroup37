package HomeWork1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class KseniyaDz {
    public static void main(String[] args) {
    //Ex 1. Написать приложение, которое будет вычислять и выводить значение по формуле: a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
    int b =10,c =5;
    int a = 4*(b+c-1)/2;

    System.out.println("A: " + a);

    //Ex 2. В переменной n хранится двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр n. Например: n =26, в результате мы должны получить 8 (2+6).
    int n2 = 12; //число в конце переменной соответствует номеру задания

    int firstNumber2 = n2/10, secondNumber2 = n2%10; //вычисление первой и второй цифр
    int sum2 = firstNumber2+secondNumber2;//сложение

    System.out.println("Sum of numbers in "+ n2+": "+sum2);

    //Ex 3.В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить 9 (1+2+6).
    int n3 = 126;

    int firstNumber3 = n3/100, otherNumber = n3%100; //вычисление первой цифры и двух оставшихся
    int secondNumber3 = otherNumber/10, thirdNumber3 = otherNumber%10; // вычисление второй и третьей цифр

    int sum3 = firstNumber3+secondNumber3+thirdNumber3; //сложение

    System.out.println("Sum of numbers in "+ n3+": "+sum3);

    //Ex 4. В переменной n хранится вещественное число с ненулевой дробной частью. Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
    float numberF = 3.26f;
    System.out.println("Integer part of "+ numberF + ": "+ (int)numberF); //использование явного приведения для вывода целой части

    //Ex 5. В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат деления q на w с остатком. Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8):  21 / 8 = 2 и 5 в остатке.*/
    int q = 21, w = 8;
    System.out.println("Division: " + q +" / "+w + " = "+ q/w + "(" + q%w +")"); //вычисление частного и остатка в процессе вывода
    }
}