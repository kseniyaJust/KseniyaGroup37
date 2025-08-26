package HomeWork4.lessonTasks;

public class HardTask {
    //        Сложные:    1. Поиск второго по величине числа. Найди второй наибольший элемент без сортировки
    //Алгоритм решения: Отсортировать массив с помощью быстрой сортировки и после выбрать элемент который стоит перед максимальным

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

        int[] arrSecondMax = {23, 9, 40, 6, 10};
        System.out.print("Array for hard task: ");
        for (int i : arrSecondMax) {
            System.out.print(i + " ");
        }
        System.out.print("\n");

        quickSort(arrSecondMax, 0, arrSecondMax.length - 1);

        int max = arrSecondMax[arrSecondMax.length-1];
        int secondMax=0;
        for(int i =arrSecondMax.length-1;i>=0;i--){
            if(arrSecondMax[i] != max){
                secondMax = arrSecondMax[i];
                break;
            }

        }
        System.out.println("Second max of array: " + secondMax);

    }

}
