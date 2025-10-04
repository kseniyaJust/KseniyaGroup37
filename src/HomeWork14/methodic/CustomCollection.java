package HomeWork14.methodic;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class CustomCollection<T> {
    T[] arr;
    int iterator;
    private Annotation[] annotations;
    private T el;
    private T[] copy;
    private T t;

    CustomCollection() {
        iterator = 0;
        arr = (T[]) new Object[3]; // с просто тшкой не хочет работать
    }

    public void add(T el) {
        if (iterator > arr.length - 1) {
            T[] copy = arr.clone();
            arr = (T[]) new Object[arr.length + 10];
            iterator = 0;
            for (T t : copy) {
                arr[iterator] = t;
                iterator++;
            }
            Arrays.fill(arr, iterator, arr.length - 1, null);
        }
        arr[iterator] = el;
        iterator++;
    }

    public void remove() {
        if (iterator == 0)
            iterator = 1;
        iterator--;
        arr[iterator] = null;
    }

    public T find(int index) throws ArrayIndexOutOfBoundsException {
        if (index < arr.length - 1 && arr[index] != null)
            return arr[index];
        throw new ArrayIndexOutOfBoundsException();

    }

    public boolean isExists(T el) {
        for (T elArr : arr) {
            if (elArr == el)
                return true;
        }
        return false;
    }

    public void clear() {
        Arrays.fill(arr, null);
    }

    @Override
    public String toString() {
        StringBuilder line = new StringBuilder();
        line.append("{ ");
        for (T el : arr) {
            if (el != null)
                line.append(el + " ");
        }
        line.append("}\n");
        return line.toString();
    }
}
/*
* Предусмотреть операции(методы):
1. добавления элемента
2. удаления элемента
3. получение элемента по индексу
4. проверка есть ли элемент в коллекции
5. очистка всей коллекции*/
