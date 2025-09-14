package HomeWork9.lesson;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ClassForCallMethods {

    public static void main(String[] args) {
        StringWork stringWork = new StringWork(); //класс со всеми методами для задания
        Scanner scanner = new Scanner(System.in);

        //1. Пользователь вводит строку (Например Мама).Нужно вывести в консоль:
        //M
        //Ma
        //Mam
        //Mama
        //2. Кол-во слов в строке
        System.out.println("Enter line ");
        String line = scanner.nextLine();
        stringWork.countWordsAndShowTheLine(line);
        System.out.println("---------------------------------- TASK 1_2");

        //3. Пользователь вводит строку из чисел через запятую(например 3,8,9,23,27) и число. Нужно вывести числа из строки которые меньше чем число которое ввел пользователь.
        System.out.println("Enter line of numbers with , ");
        String numberLine = scanner.next();
        System.out.println("Enter number to compare and you see numbers that less");
        int numberForCompare = scanner.nextInt();
        stringWork.findLessNumbers(numberLine, numberForCompare);
        System.out.println("----------------------------TASK 3");

        //4. Метод isPalindrome(String input) проверяет, является ли строка палиндромом. Условие: Игнорировать регистр и пробелы.
        System.out.println("Enter line for checking on palindrome");
        String linePalindrome = scanner.next();
        System.out.println("Result. Is your line palindrome: " + stringWork.isPalindrome(linePalindrome));
        System.out.println("-------------------------------- TASK 4");

        //5. Метод compress(String input) реализует простое сжатие строки. Пример: "aaabbc" → "a3b2c1" Условие: Если сжатая строка не короче исходной — вернуть исходную.
        System.out.println("Enter line for compress: ");
        String lineForCompress = scanner.next();
        System.out.println("Compress line " + stringWork.compress(lineForCompress));

        System.out.println("------------------------------- TASK 5 \nEND OF TASK");
        scanner.close();

    }
}
