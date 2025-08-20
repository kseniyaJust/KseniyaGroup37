import java.util.Arrays;
import java.util.Scanner;

public class SecondDZKseniya {


    //Заставляет ввести число
    public static int checkRightInput(Scanner scan) { //static - привязывает метод к классу. Иначе нам нужно создавать объект класса и мы не сможем обратиться к методу напрямую из main
        //TODO: Немного сокращенная версия чата
        int number = 0;
        while (true){
            try{ //пытается выполнить код и если ловит исключение то переходит в блок catch
                number = Integer.parseInt(scan.nextLine()); // конструкция Integer.parseInt пробует преобразовать введенную строку в int
                return number;//прерывание цикла
            }catch (NumberFormatException e){ // обрабатывает ошибку несовпадения формата. Срабатывает если введено не число
                System.out.println("Enter a number");
            }
        }

        /*TODO: Мое решение. Не смогла сделать так чтобы заставляло вводить пока не введешь число (хотела реализовать без обработки исключений)
                   if(scan.hasNextInt())
                       return scan.nextInt();
                   else{
                      System.out.println("You are not enter a number (it will be 1) so RERUN the program");
                      return 1;
                   }*/


    }
    /*Алгоритм решения задачи на собесе:
    * 1. Задаем доп вопросы
    * 2.Проговориваем самое просто решение
    * 3. Написать простое решение
    * 4. Проговорить что можно улучшить и улучшить*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //TODO: единый сканер для всех

        //1. Ввести с консоли любое число. Если оно четное – вывести его в консоль.
        System.out.println("Ex 1: Enter number. If it even - sout");
        int numberCheck = checkRightInput(scan); //проверка и присваивание числа
        System.out.println("You enter number: " + ((numberCheck % 2 == 0) ? numberCheck+ " - even ": "not even"));

        //2. Вывести строкой число от 1 до 5 которое будет передано в switch. Если число не в этом диапазоне, сообщить об этом.
        System.out.println("\nEx2: Enter number. If it 1 to 5 it'll give you it's string name");
        int numberForStringOut = checkRightInput(scan); //первичная проверка и присваивание числа

        while (numberForStringOut < 1 || numberForStringOut > 5) { //заставляет вводить число пока оно не будет в диапазоне от 1 до 5
            System.out.println("Enter normal number, idiot(1 to 5)");
            numberForStringOut = checkRightInput(scan); //проверка и присваивание числа
        }
        String stringOutput = switch (numberForStringOut) {
            case 1->"one";
            case 2->"two";
            case 3->"three";
            case 4->"four";
            case 5->"five";
            default->"How did you do that?";
        };
        System.out.println(stringOutput);

        //3. Используя while вывести все числа от 0 до 25 в одну строку через пробел.
        System.out.print("\nEx3: ");
        int numberWithWhile = -1;
        while (numberWithWhile < 25) {
            ++numberWithWhile; // изменение переменной для корректной работы циклы
            System.out.print(numberWithWhile + " "); //вывод через пробел
        }
        System.out.print('\n');

        //4. Используя for вывести каждое четное число от 2 до 20 включительно.
        System.out.print("\nEx4: ");
        for (int i = 2; i <= 20; i = i+2)
            System.out.print(i + " "); // вывод через пробел
        System.out.print('\n');

        //5. Напишите программу, которая запрашивает у пользователя 5 чисел и выводит их сумму.
        System.out.println("\nEx5: Enter 5 numbers for sum");
        int sum = 0;
        for (int i = 0; i < 5; i++)
            sum += checkRightInput(scan); //сложение введенных чисел
        System.out.println("Sum of the entered numbers: " + sum);

        //6. Считайте 3 числа и выведите максимальное из них.
        System.out.println("\nEx6: Enter 3 numbers to find max");
        int max =checkRightInput(scan);
        for(int i =0;i<2;i++){
            int temp = checkRightInput(scan);
            if(max<temp)
                max = temp;
        }
        System.out.println("Max number in entered : " + max);

        //7. С помощью цикла выведите таблицу умножения на число, введённое пользователем (от 1 до 10).
        System.out.println("\nEnter number for multiply ");
        int numberForMultiply = checkRightInput(scan);

        if (numberForMultiply > 0 && numberForMultiply < 11) { //проверка корректного ввода
            for (int i = 1; i <= 10; i++) {
                System.out.println(numberForMultiply + " * " + i + " = " + numberForMultiply * i);
            }
        }
        else System.out.println("Number is not part of multiply table");

        //8. Пользователь вводит два числа a и b (a < b). Выведите все числа от a до b включительно с помощью цикла.
        System.out.println("\nEnter two number a and b (a<b) and you'll see all numbers between");
        int a = checkRightInput(scan);
        int b = checkRightInput(scan);
        if (a < b) {
            for (int i = a; i <= b; i++)
                System.out.print(i + " ");
        }
        else System.out.println("a is not less than b. Congratulations");

        scan.close(); //TODO: закрытие сканнера

    }
}
