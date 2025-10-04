package HomeWork15.methodic;

import java.util.Arrays;
import java.util.HashMap;

public class MainClass {
    public static void main(String[] args) {
        String[] wordsFor1And2 = new String[]{"add", "cat", "add"};
        System.out.println("Words fo TASK 1_2 " + Arrays.toString(wordsFor1And2));
        System.out.println("----------------");
        //1
        HashMap<String, Boolean> repeatWordsMap = new HashMap<>();
        for (String word : wordsFor1And2) {
            if (!repeatWordsMap.containsKey(word)) {
                repeatWordsMap.put(word, false);
                continue;
            }
            if (repeatWordsMap.get(word))
                continue;
            repeatWordsMap.put(word, true);
        }
        System.out.println(repeatWordsMap);
        System.out.println("---------------------END OF TASK 1");
        //2
        HashMap<String, String> firstLastSymbol = new HashMap<>();
        for (String word : wordsFor1And2) {
            firstLastSymbol.put("" + word.charAt(0), "" + word.charAt(word.length() - 1));
        }
        System.out.println(firstLastSymbol);
        System.out.println("---------------------END OF TASK 2");
        //*
        String brackets = "{([])}";
        HashMap<Character, Character> bracketsRelationship = new HashMap<>();
        bracketsRelationship.put('{', '}');
        bracketsRelationship.put('[', ']');
        bracketsRelationship.put('(', ')');

        int endOfStr = brackets.length() - 1;
        boolean balance = true;
        int mid = brackets.length() / 2;
        for (int i = 0; i <= mid; i++, endOfStr--) {
            if (!bracketsRelationship.containsKey(brackets.charAt(i)))
                continue;
            if (brackets.charAt(endOfStr) != bracketsRelationship.get(brackets.charAt(i))) {
                balance = false;
                break;
            }
        }
        System.out.println("Str " + brackets + " balanced " + balance);
        System.out.println("---------------------END OF TASKS");

    }
}
/*
Задача 1: На вход поступает массив строк, верните Map<String,Boolean>, где каждая отдельная строка является ключом,
 и ее значение равно true, если эта строка встречается в массиве 2 или более раз.

Задача 2:
На вход поступает массив непустых строк, создайте и верните Map<String,String> следующим образом: для каждой строки добавьте ее первый символ
в качестве ключа с последним символом в качестве значения

Задача *: Задана строка, которая может иметь внутри себя скобки.
Проверить сбалансированность расстановки скобок*/