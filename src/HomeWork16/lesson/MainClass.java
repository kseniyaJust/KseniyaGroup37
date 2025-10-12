package HomeWork16.lesson;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MainClass {
    public static List<String> filter(List<String> input, StringFilter filter) {
        List<String> resultValues = new ArrayList<>();

        for (String line : input) {
            if (filter.accept(line)) {
                resultValues.add(line);
            }
        }
        return resultValues;
    }

    public static List<String> convertAll(List<Integer> input, IntToStringConverter converter) {
        List<String> resultList = new ArrayList<>();
        for (Integer i : input) {
            resultList.add(converter.convert(i));
        }
        return resultList;
    }

    public static int count(List<String> input, StringCondition condition) {
        int counter = 0;
        for (String line : input) {
            if (condition.test(line)) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        //Задача даты
        DateTask.getDays();

        List<String> inputLines = List.of("Hello", "world", "OR", "Sergey", "Year");
        List<Integer> inputNumber = List.of(1, 2, 3, 4);

        //1
        Predicate<String> isFiveLength = s -> s.length() > 5;
        Predicate<String> isFirstUpperCase = s -> String.valueOf(s.charAt(0)).matches("[A-ZА-Я]");
        System.out.println(filter(inputLines, (StringFilter) isFirstUpperCase));
        //2
        IntToStringConverter intToStringConverter = i -> "Число: " + i; // String::valueOf
        System.out.println(convertAll(inputNumber, intToStringConverter));

        //Кол - во слов содержащих букву 'а'
        StringCondition containsACharacter = s -> s.contains("a");
        //3

        StringCondition isUpperCase = s -> s.equals(s.toUpperCase());
        System.out.println(count(inputLines, isUpperCase));
    }
}
/*
* Задача Даты:
Напиши Java-программу, которая:
Принимает от пользователя дату начала отпуска(формата dd.MM.yyyy) и количество дней.
Вычисляет дату окончания отпуска.
Проверяет, попадает ли отпуск на праздничные дни (например, 1 января, 7 января, 9 мая).
Выводит:
Дату начала и окончания отпуска.
Количество рабочих дней в отпуске (исключая выходные и праздники).
Список праздничных дней, попавших в отпуск.

Задачи:
1. Создайте функциональный интерфейс StringFilter с методом boolean accept(String s).
В Main реализуйте метод public static List<String> filter(List<String> input, StringFilter filter).

2. Создайте функциональный интерфейс IntToStringConverter с методом String convert(int value).
В Main реализуйте метод public static List<String> convertAll(List<Integer> input, IntToStringConverter converter) который будет преобразовывать число n в строку "Число: n".

3. Создайте функциональный интерфейс StringCondition с методом boolean test(String s).
В Main реализуйте метод public static int count(List<String> input, StringCondition condition)*/