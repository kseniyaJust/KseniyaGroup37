package HomeWork5.metodics;

import java.util.Arrays;
import java.util.Scanner;

public class WithStar {
    //Задача *:
    //Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
    //Формат входных данных:
    //Программа получает на вход два числа n и m.
    //Формат выходных данных:
    //Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
    //символа

    public static void hardTask(Scanner scanner){
        System.out.println("Enter n and m");
        int n = scanner.nextInt(), m=scanner.nextInt();
        String[][] matrixSnake = new String[n][m];
        int numberForSnake =0;
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(numberForSnake<=9)
                    matrixSnake[i][j] = " " + numberForSnake+ " ";
                else if(numberForSnake<99)
                    matrixSnake[i][j] = numberForSnake + " ";
                else matrixSnake[i][j] = numberForSnake +"";
                numberForSnake++;
                System.out.print(matrixSnake[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
