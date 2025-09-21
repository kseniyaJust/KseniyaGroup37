package HomeWork11.lesson;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//регулярные выражения
public class JustClass {
    public static void main(String[] args) {
        //1. Удаление повторяющихся пробелов
        //Задача: заменить все последовательности пробелов на один Пример: "Это пример текста" → "Это пример текста"
        String textRepeatSpaces = " This is   text";
        System.out.println(textRepeatSpaces);
        textRepeatSpaces = textRepeatSpaces.replaceAll("\\s+", " ").trim();
        System.out.println(textRepeatSpaces);
        System.out.println("--------------------TASK_1");

        //"ivan.petrov@gmail.com" "anna@ya.ru"
        //2. Извлечение доменов из email-адресов
        //Дано: список email-адресов Задача: извлечь доменную часть (после @) Пример: "ivan.petrov@gmail.com" → "gmail.com"
        String email = "ivan.petrov@gmail.com";
        System.out.println(email);
        String domen = email.substring(email.indexOf("@") + 1);
        System.out.println("Domen: " + domen);
        System.out.println("--------------------TASK_2");

        //3. Поиск всех чисел в тексте
        //Дано: произвольный текст Задача: найти все целые и дробные числа (включая отрицательные) Пример: "Температура -3.5°C, рост 180" → ["-3.5", "180"]
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line with numbers");
        String textWithNumbers = scanner.nextLine();
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

        Matcher matcher = pattern.matcher(textWithNumbers);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
        System.out.println();
        scanner.close();
        System.out.println("--------------------TASK_3");

        //4. Извлечение даты из строки
        //Дано: строка "Дата: 2024-07-22" Задача: извлечь дату в формате YYYY-MM-DD Пример: "2024-07-22"
        Pattern patternDate = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        String input = "Date: 2024-17-02";
        System.out.println(input);
        Matcher matcherDate = patternDate.matcher(input);
        if (matcherDate.find()) {
            System.out.println("Found date " + matcherDate.group());
        } else System.out.println("Didn't have a date");
        System.out.println("--------------------TASK_4");

        //5. Удаление HTML-тегов из текста
        //Дано: строка с HTML Задача: удалить все теги, оставив только текст Пример: "<b>Hello</b> <i>world</i>" → "Hello world"
        String htmlText = "<b>Hello</b> <i>world</i>";
        System.out.println(htmlText);
        Pattern htmlPattern = Pattern.compile("<[^>]+>");
        htmlText = htmlText.replaceAll(htmlPattern.pattern(), " ").replaceAll("\\s+", " ").trim();
        System.out.println(htmlText);


    }
}
