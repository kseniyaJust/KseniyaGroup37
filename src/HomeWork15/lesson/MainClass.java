package HomeWork15.lesson;


import java.io.*;
import java.util.*;

public class MainClass {
    public static HashMap stringToMap(String input) {
        HashMap<Character, Integer> inputMap = new HashMap<>();
        for (char el : input.toCharArray()) {
            inputMap.put(el, inputMap.getOrDefault(el, 0) + 1);
        }
        return inputMap;
    }

    public static boolean isAnagram(String firstWord, String secondWord) {
        HashMap<Character, Integer> firstMap = stringToMap(firstWord);
        HashMap<Character, Integer> secondMap = stringToMap(secondWord);

        return firstMap.equals(secondMap);
    }

    public static void main(String[] args) {
        //1
        String firstInput = "act", secondInput = "cat";
        System.out.println(firstInput + " and " + secondInput + " is anagram: " + isAnagram(firstInput, secondInput));
        System.out.println("-------------------END  OF TASK 1");
        //2
        HashMap<String, Integer> telephoneList = new HashMap<>();
        telephoneList.put("Alex", 1234567);
        telephoneList.put("Vik", 6853948);
        telephoneList.put("Kseniya", 4809786);

        HashMap<Integer, String> reverseTelephoneList = new HashMap<>();

        for (String key : telephoneList.keySet()) {
            reverseTelephoneList.put(telephoneList.get(key), key);
        }
        System.out.println(telephoneList);
        System.out.println(reverseTelephoneList);
        System.out.println("-------------------END  OF TASK 2");
        //3
        LinkedList<Integer> numbers = new LinkedList<>();
        int n = 5, factSum = 0, requireSum = 0;
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(5);
        System.out.println(numbers);
        for (int i = 1; i <= n; i++) {
            requireSum += i;
        }
        for (int el : numbers) {
            factSum += el;
        }
        if (requireSum - factSum == 0) {
            System.out.println("All numbers present");
        } else {
            System.out.println("You missed " + (requireSum - factSum));
        }
        System.out.println("-------------------END  OF TASK 3");
        //4
        String path = "src/HomeWork15/lesson/bookText.txt";
        try (BufferedReader textFromBook = new BufferedReader(new FileReader(path))) {
            HashMap<Integer, LinkedList<String>> wordsForLength = new HashMap<>();
            String line;
            while ((line = textFromBook.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;
                for (String el : line.split("[\\s\\p{Punct}]+")) {
                    if (wordsForLength.containsKey(el.length()) && wordsForLength.get(el.length()).contains(el))
                        continue;
                    wordsForLength.put(el.length(), wordsForLength.getOrDefault(el.length(), new LinkedList<>()));
                    wordsForLength.get(el.length()).add(el);
                }
            }
            for (int i : wordsForLength.keySet()) {
                System.out.println(i + " " + wordsForLength.get(i));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-------------------END  OF TASK 4");

    }
}
/*Задача 1: "Поиск анаграмм"
Условие: Напишите метод, который принимает два слова и возвращает true, если они являются анаграммами (состоят из одних и тех же букв в разном порядке).
Задача 2: "Сломанный телефон"
Условие: У нас есть телефонная книга в виде HashMap (имя -> номер). Нужно создать обратную мапу (номер -> имя).
Задача 3: "Поиск пропущенного числа"
Условие: Дан массив чисел от 1 до N, где одно число пропущено. Найдите его.
Задача 4: "Группировка по длине слова"*/