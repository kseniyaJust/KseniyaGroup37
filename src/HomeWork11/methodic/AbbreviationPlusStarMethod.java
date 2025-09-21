package HomeWork11.methodic;
//Задача 1:
//Вывести в консоль из строки которую пользователь вводит с клавиатуры все
//аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
//только из прописных букв, без чисел.

//Задача *:
//Программа на вход получает произвольный текст. В этом тексте может быть номер
//документа(один или несколько), емейл и номер телефона. Номер документа в
//формате: xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате:
//+(xx)xxxxxxx. Документ может содержать не всю информацию, т.е. например, может не
//содержать номер телефона, или другое. Необходимо найти эту информацию и вывести
//в консоль в формате:
//email: teachmeskills@gmail.com
//document n

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AbbreviationPlusStarMethod {
    public static String findByPattern(Pattern patternEx, String line) {
        if (line == null || line.isEmpty())
            return line;
        Matcher matcher = patternEx.matcher(line);
        StringBuilder res = new StringBuilder();
        while (matcher.find())
            res.append(matcher.group() + " ");
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1
        String lineWithABB = scanner.nextLine();
        Pattern abbPattern = Pattern.compile("[A-Z]{2,6}");

        System.out.println("Found abbreviation: " + findByPattern(abbPattern, lineWithABB));
        System.out.println("-----------------TASK ABBREVIATION");
        //*
        String infoText = "Документ может содержать не всю информацию, т.е. например, может не содержать номер телефона, или другое. Необходимо найти эту информацию и вывести\n" +
                "в консоль в формате: email: teachmeskills@gmail.com document 1234-1234-12 телефон +(23)3344337";
        System.out.println(infoText);

        System.out.println("---------------------------------\nFound info:");
        Pattern patternEmail = Pattern.compile(" \\w+@\\w+.\\w+ ");
        Pattern patternDocument = Pattern.compile("\\d{4}-\\d{4}-\\d{2}");
        Pattern patternTelephone = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");

        System.out.println("email: " + findByPattern(patternEmail, infoText));
        System.out.println("document: " + findByPattern(patternDocument, infoText));
        System.out.println("telephone: " + findByPattern(patternTelephone, infoText));


    }
}
