package HomeWork4.lessonTasks;

import java.util.Arrays;

public class HardTask {
    //        Сложные:    1. Поиск второго по величине числа. Найди второй наибольший элемент без сортировки
    //Не знаю правильно ли поняла. Я надеюсь что "без сортировки" имелосьь ввиду без метода Arrays, а ручное не учитывалось


    //сортировка массива относительно выбранного диапазона, где все что ниже выбранной опорной точки (pivot) находится слева
    private static int partition(int[] arr,int low,int high){
        int middle = low+(high-low)/2;//середина массива
        int pivot = arr[middle]; //значение середины массива

        //подмена середины массива с концом выбранного диапазона. с выбранной серединой массива будут сравниваться все остальные элементы
        int temp = arr[middle];
        arr[middle] = arr[high];
        arr[high] = temp;

        int i = (low -1); //отдельный счетчик для возможности подмены чисел меньше pivot
        for(int j =low;j<high;j++){
            if(arr[j]<pivot){ //если число меньше опорной точки то оно должно стоять слева
                i++;

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //число которое стоит правее счетчика всегда будет больше или равно опорной точке (так как при переборе цикла это число не попало под условие),
        // значит их нужно поменять местами
        temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1; //
    }
    private static void quickSort(int[] arr,int low, int high){
        if(low<high){ //если условие не верно значит эта часть уже отсортирована
            int pi = partition(arr,low,high);

            quickSort(arr,low,pi-1);//рекурсия для проверки левой части
            quickSort(arr,pi+1,high);//рекурсия для проверки правой части
        }
    }


    public static void hardTask() {
        int[] arrSecondMax = {3, 9, 40, 6, 23};
        System.out.println("Array for hard task: " + Arrays.toString(arrSecondMax)) ;
        //с ручной сортировкой
        /*

        quickSort(arrSecondMax, 0, arrSecondMax.length - 1);

        int max = arrSecondMax[arrSecondMax.length-1];
        int secondMax=0;
        for(int i =arrSecondMax.length-1;i>=0;i--){
            if(arrSecondMax[i] != max){
                secondMax = arrSecondMax[i];
                break;
            }

        }
        System.out.println("Second max of array: " + secondMax);*/
        //по другому
        /*int max = 0;
        for (int el: arrSecondMax){
            if(max<el)
                max=el;
        }
        int delta = max-arrSecondMax[0];
        int secondMax = arrSecondMax[0];

        for (int el: arrSecondMax){
            if(delta > max-el && max !=el){
                secondMax = el;
                delta = max-el;
            }
        }
        System.out.println("Second max number " + secondMax);*/
        //еще по другому
        int max =arrSecondMax[0], secondMax =0;
        for (int el: arrSecondMax){
            if(max<el){
                secondMax = max;
                max=el;
            } else if(el<max && secondMax<el)
                secondMax = el;
        }
        System.out.println(secondMax);
    }

}
