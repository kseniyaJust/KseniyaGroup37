package HomeWork17.methodic;

import java.util.*;

public class MainClass {

    public static void main(String[] args) {
        //1
        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbersList.add(i);
        }
        int sum = numbersList.stream().distinct()
                .filter(i -> numbersList.indexOf(i) % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println(sum);
        //*
        HashMap<Integer, String> data = new HashMap<>();
        data.put(1, "Ksen");
        data.put(2, "Pav");
        data.put(3, "Kat");
        data.put(4, "Ivan");
        data.put(5, "Liza");
        data.put(6, "Sam");
        data.put(8, "Mey");

        Set<Integer> numbersForId = Set.of(1, 2, 5, 8, 9, 13);
        List<String> name = data.entrySet().stream()
                .filter(el -> numbersForId.contains(el.getKey()))
                .filter(el -> el.getValue().length() % 2 == 1)
                .map(el -> new StringBuilder(el.getValue()).reverse().toString())
                .toList();
        System.out.println(name);
    }
}
/*Задача 1: Создать коллекцию типа ArrayLIst и наполнить ее значениями Integer
С помощью Stream ов:
удалить дубликаты
оставить только четные элементы
вывести сумму оставшихся элементов в стиме
* Задача *:
Создать набор данных в формате id -name охраненный в Map. Необходимо отобрать из этого набора
только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13. Среди отобрнных значений
отобрать только те которые  меют нечетное количество букв в имени. После чего вернуть список
List имен, записанных буквами задом наперед
* */