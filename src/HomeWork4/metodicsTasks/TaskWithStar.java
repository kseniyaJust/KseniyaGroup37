package HomeWork4.metodicsTasks;

import java.util.Arrays;

public class TaskWithStar {
    //Задача *:
    //Имеется массив из неотрицательных чисел(любой). Представьте что массив
    //представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
    //добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
    //содержит нуля в начале, кроме самого числа 0.



    public static void algorithmStarTask(){
        System.out.println("-------------------------");
        //более простой вариант (идею взяла у Моисеева Ильи)
        int len = 3;
        int[] arrNumbers = ArraysMetodics.RandomNumbers(len,1,9);
        // int[] arrNumbers = {9,9,9};

        System.out.println("Default array:" + Arrays.toString(arrNumbers));
        for(int i =arrNumbers.length-1;i>=0;i--){
            if (arrNumbers[i]<9){
                arrNumbers[i]+=1; //если прибавил единицу то выходит из цикла
                break;
            }
            else {
                arrNumbers[i]=0;
                if(i ==0){ // если первая цифра равна девятке и единица еще не была прибавлена, то это значит что это 9,99,999 и т.д. А значит нужен больший массив
                    arrNumbers = new int[len+1]; //переопределеяю ссылку массива на большее пространство
                    Arrays.fill(arrNumbers,0); //заполняю нулями
                    arrNumbers[0]=1;//меняю первый элемент на единицу
                }

            }
        }
        System.out.println(Arrays.toString(arrNumbers));

        //более мудренный мой вариант с преобразованиями (тоже рабочий )

        /*String forNumber = "";
        for(int el: arrNumbers)
            forNumber +=el;

        int resultNumber = Integer.parseInt(forNumber) +1;

        String resultStr = resultNumber + "";

        int[] resultArray = new int[resultStr.length()];
        for(int i =0;i<resultArray.length;i++){
            resultArray[i] = resultStr.charAt(i)-48; //-48 поскольку оно переводит в ASCII код
        }
        System.out.println("Result with plus one: " + Arrays.toString(resultArray));*/
    }
}
