package HomeWork5.metodics;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DZ {

    public static void main(String[] args) {
        //Задача 1:
        //1.1 Создать двумерный массив, заполнить его случайными числами.
        //1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
        //1.3 Найти сумму всех получившихся элементов и вывести в консоль.
        int[][] matrixWithNoConsole = new int[3][4];
        Random rnd = new Random();

        for (int i = 0; i < matrixWithNoConsole.length; i++) {
            for (int j = 0; j < matrixWithNoConsole[i].length; j++) {
                matrixWithNoConsole[i][j] = rnd.nextInt(1, 10);
            }
        }
        System.out.println(Arrays.deepToString(matrixWithNoConsole));

        System.out.println("Enter number for plus");
        Scanner scanner = new Scanner(System.in);

        int plusNumber = scanner.nextInt(), sum = 0;
        for (int i = 0; i < matrixWithNoConsole.length; i++) {
            for (int j = 0; j < matrixWithNoConsole[i].length; j++) {
                matrixWithNoConsole[i][j] += plusNumber;
                sum += matrixWithNoConsole[i][j];
            }
        }

        System.out.println(Arrays.deepToString(matrixWithNoConsole));
        System.out.println("Sum of elements with plus " + plusNumber + ": " + sum);
        System.out.println("-------------------------------------");

        //Задача 2:
        //Создать программу для раскраски шахматной доски с помощью цикла. Создать
        //двумерный массив String 8х8. С помощью циклов задать элементам массива значения
        //B(Black) или W(White). При выводе результат работы программы должен быть

        String[][] wbMatrix = new String[8][8];
        boolean inWB = true;
        for (int i = 0; i < wbMatrix.length; i++) {
            for (int j = 0; j < wbMatrix[i].length; j++) {
                wbMatrix[i][j] = (inWB) ? "W" : "B";
                System.out.print(wbMatrix[i][j] + ' ');
                inWB = !inWB;
            }
            System.out.print('\n');
        }
        System.out.println("-------------------------------------");

        WithStar.hardTask(scanner);
        scanner.close();

    }



}
