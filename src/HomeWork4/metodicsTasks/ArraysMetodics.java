package HomeWork4.metodicsTasks;


//это задания из методички. я только щас доперла что из нее задания брать надо
public class ArraysMetodics {
    //генерирует псевдослучайные числа для массива
    public static int[] RandomNumbers(int lengthArr, int min, int max) {
        int[] arr = new int[lengthArr];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * max + min);
        }
        return arr;
    }

    //выводит элементы массива. numberEx - число задания. Первая цифра - номер задания, вторая цифра - номер массива в задании
    public static void ShowArray(int[] arr, int numberEx, String type) {
        System.out.print("Array for ex " + numberEx + ": ");
        switch (type) {
            case "normal":
                for (int j : arr) System.out.print(j + " ");
                break;
            case "reverse":
                for (int i = arr.length - 1; i >= 0; i--)
                    System.out.print(arr[i] + " ");
                break;

        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        //данный массив используется для задания 1-3
        int[] arrFor1to3 = RandomNumbers(5, 1, 10);

        //Задача 1: Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
        ShowArray(arrFor1to3, 11, "normal");
        ShowArray(arrFor1to3, 12, "reverse");
        System.out.println("-------------------");

        //Задача 2: Найти минимальный-максимальный элементы и вывести в консоль.
        //Задача 3: Найти индексы минимального и максимального элементов и вывести в консоль.
        int max = arrFor1to3[arrFor1to3.length - 1], min = arrFor1to3[0];
        int maxIndex = 0, minIndex = 0;
        for (int i = 0; i < arrFor1to3.length; i++) {
            if (arrFor1to3[i] < min) {
                min = arrFor1to3[i];
                minIndex = i;
            } else if (arrFor1to3[i] > max) {
                max = arrFor1to3[i];
                maxIndex = i;
            }
        }
        System.out.println("Min element on index " + minIndex + " is " + min);
        System.out.println("Min element on index " + maxIndex + " is " + max);
        System.out.println("-------------------");

        //Задача 4: Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести сообщение, что их нет.
        int[] arrZero = RandomNumbers(6, 0, 4);
        ShowArray(arrZero, 4, "normal");
        int countZeros = 0;
        for (int el : arrZero) {
            if (el == 0)
                countZeros++;
        }
        if (countZeros > 0)
            System.out.println("You have " + countZeros + " zeros in your array");
        else
            System.out.println("You don't have zeros in your array");
        System.out.println("-------------------");

        //Задача 5: Пройти по массиву и поменять местами элементы первый и последний, второй и предпоследний и т.д.
        int[] arrSwapNumbers = RandomNumbers(6, 1, 14);
        ShowArray(arrSwapNumbers, 51, "normal");
        int end = arrSwapNumbers.length - 1;
        int mid = (end + 1) / 2, temp;
        for (int i = 0; i < mid; i++) {
            temp = arrSwapNumbers[i];
            arrSwapNumbers[i] = arrSwapNumbers[end];
            arrSwapNumbers[end] = temp;
            end--;
        }
        ShowArray(arrSwapNumbers, 52, "normal");
        System.out.println("-------------------");

        //Задача 6: Проверить, является ли массив возрастающей последовательностью (каждое следующее число больше предыдущего).
        int[] arrIncreasing = {1, 2, 3, 4, 5, 6, 7, 8};
        ShowArray(arrIncreasing, 6, "normal");
        boolean sequance = true;
        for (int i = 0; i < arrIncreasing.length - 1; i++) {
            if (arrIncreasing[i] > arrIncreasing[i + 1]) {
                sequance = false;
                break;
            }
        }
        System.out.println("Are your array always increase?: " + sequance);

        //hard
        TaskWithStar.algorithmStarTask();
    }
}
