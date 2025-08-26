package HomeWork4.lessonTasks;

import java.util.Arrays;

//это задания которые кидались в тгк. я искренне думала, что это дз

public class ArraysKseniya {

    //создает массив с передаваемой длиной и генерирует псевдослучайные числа в заданном диапазоне
    public static int[] RandomNumbers(int lengthArr, int min, int max) {
        int[] arr = new int[lengthArr];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * max + min);
        }
        return arr;
    }

    //тоже самое для ArrayList (в паре заданий баловалась)
//    public static ArrayList<Integer> RandomNumbersList(int lengthArr, int min, int max) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        for (int i = 0; i < lengthArr; i++) {
//            list.add ((int) (Math.random() * max + min));
//        }
//        return list;
//    }

    //Выводит все элементы массива
    public static void ShowArray(int[] arr, int numberEx) {
        System.out.print("Array for ex " + numberEx + ": ");
        System.out.print(Arrays.toString(arr) + " ");
        System.out.print("\n");
    }

    //перегрузка для ArrayLIst
//    public static void ShowArray(ArrayList<Integer> arr, int numberEx) {
//        System.out.print("Array for ex " + numberEx + ": ");
//        for (int i : arr)
//            System.out.print(i + " ");
//        System.out.print("\n");
//    }

    public static void main(String[] args) {
        // Вывод Array for ex mn, где m - номер задания, n - номер массива в текущем задании

        //  1. Найди сумму всех значений, стоящих на чётных индексах массива.
        int[] arrEvenNumbers = {10, 12, 40, 3};
        ShowArray(arrEvenNumbers, 1);
        int sum = 0;
        for (int i = 0; i < arrEvenNumbers.length; i++) {
            if (i % 2 == 0)
                sum += arrEvenNumbers[i];
        }
        System.out.println("Sum of even indexes: " + sum);
        System.out.println("-------------------------------");

        //        2. Верни массив, исключив все нули. Например: [0, 1, 0, 2] → [1, 2]./
        int[] arrWithZero = RandomNumbers(5, 0, 3);
        ShowArray(arrWithZero, 21);
        //Вариант с сохранением в одномерный массив
        int countNotZeros = 0;
        for (int j : arrWithZero) {
            if (j != 0)
                countNotZeros++;
        }
        if (countNotZeros != 0) {
            int j = 0;
            int[] arrWithoutZeros = new int[countNotZeros];
            for (int k : arrWithZero) {
                if (k != 0) {
                    arrWithoutZeros[j] = k;
                    j++;
                }
            }
            ShowArray(arrWithoutZeros, 22);
        }
        System.out.println("-------------------------------");
        //Вариант с сохранением в динамичный ArrayList, который является гибким по размеру
        /*ArrayList<Integer> listWithoutZero = new ArrayList<Integer>();
        for(int i:arrWithZero){
            if(i!=0)
                listWithoutZero.add(i);
        }
        ShowArray(listWithoutZero,22);*/

//        3. Массив читается одинаково слева направо и справа налево?
        int[] arrPalindrome = {0, 1, 2, 0, 0};
        int midSize = arrPalindrome.length / 2;
        int end = arrPalindrome.length - 1;
        boolean palindrome = true;
        for (int begining = 0; begining <= midSize; begining++) {
            if (arrPalindrome[begining] != arrPalindrome[end]) {
                palindrome = false;
                break;
            }
            --end;
        }
        System.out.println("Is array palindrome: " + palindrome);
        System.out.println("-------------------------------");

//        4. Сдвинь элементы массива на 1 позицию вправо, последний элемент переходит в начало.
        int[] arrToRight = RandomNumbers(4, 1, 10);
        ShowArray(arrToRight, 41);
        int nextNumber = arrToRight[arrToRight.length - 1], previosNumber;
        for (int i = 0; i < arrToRight.length; i++) {
            previosNumber = arrToRight[i];
            arrToRight[i] = nextNumber;
            nextNumber = previosNumber;
        }
        ShowArray(arrToRight, 42);
        System.out.println("-------------------------------");

//        5. Удалить элемент по значению. Удали первое вхождение заданного значения из массива. Верни новый массив без него.
        int[] arrayWithFirstNumber = RandomNumbers(5, 0, 10);
        ShowArray(arrayWithFirstNumber, 51);
        int[] arrayWithoutFirstNumber = Arrays.copyOfRange(arrayWithFirstNumber, 1, arrayWithFirstNumber.length);
        ShowArray(arrayWithoutFirstNumber, 52);
        System.out.println("-------------------------------");

        //        6. Найди среднее арифметическое значений в массиве без учета максимального и минимального значения.
        int[] arrMidNumber = RandomNumbers(6, 1, 10);
        ShowArray(arrMidNumber, 6);
        Arrays.sort(arrMidNumber);
        int min = arrMidNumber[0], max = arrMidNumber[arrMidNumber.length - 1];
        int countNumberFirMid = 0, numbersForMid = 0;
        for (int element : arrMidNumber) {
            if (element == min || element == max)
                continue;
            numbersForMid += element;
            countNumberFirMid++;
        }
        if(countNumberFirMid != 0)
            System.out.println("Mid number of array: " + numbersForMid / countNumberFirMid);
        System.out.println("-------------------------------");

        //        7. Создай два новых массива: один из положительных, другой из отрицательных чисел исходного.
        int[] arrayPlus = RandomNumbers(5, 1, 10);
        ShowArray(arrayPlus, 71);
        int[] arrayNegative = Arrays.copyOf(arrayPlus, arrayPlus.length);
        for (int i = 0; i < arrayNegative.length; i++)
            arrayNegative[i] *= -1;
        ShowArray(arrayNegative, 72);
        System.out.println("-------------------------------");

        //Сложное
        HardTask.hardTask();

    }
}
