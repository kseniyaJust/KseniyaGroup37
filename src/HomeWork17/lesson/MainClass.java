package HomeWork17.lesson;

import java.util.*;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        //1
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ksen", "Security", 100000));
        employees.add(new Employee("Ivan", "IT", 100000));
        employees.add(new Employee("Kate", "Security", 90000));

        List<String> nameOfSuitableEmployees = employees.stream()
                .filter(emp -> Objects.equals(emp.getDepartment(), "Security"))
                .filter(emp -> emp.getSalary() >= 100000)
                .map(Employee::getName)
                .toList();
        System.out.println("Suitable employees " + nameOfSuitableEmployees);
        System.out.println("----------------TASK 1");
        //2
        List<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 10; i++)
            numbers.add(i);

        int sum = numbers.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .reduce(0, (x, y) -> x + y);
        System.out.println("Sum " + sum);
        System.out.println("----------------TASK 2");
        //3
        List<String> lines = List.of(
                "Stream API is powerful",
                "Java stream is powerful",
                "Powerful tools in Java"
        );
        long countWords = lines.stream().
                map(String::toLowerCase)
                .map(el -> el.split("\\s+"))
                .flatMap(Arrays::stream)                 // Объединяем все массивы слов в один поток
                .map(String::trim)
                .distinct()
                .count();

        System.out.println("Unique words " + countWords);
        System.out.println("----------------END OF TASKS");

    }
}
/*1. Фильтрация и преобразование списка сотрудников
Дан список сотрудников List<Employee> employees.
Нужно получить список имен сотрудников из отдела "Security", у которых зарплата выше 100_000.
Ожидаемый результат: List<String> — имена подходящих сотрудников.

2. Сумма чисел, кратных 3 или 5
Дан список List<Integer> numbers. Найти сумму всех чисел, кратных 3 или 5.

3. Подсчёт количества уникальных слов
Дан список строк List<String> lines. Нужно посчитать количество уникальных слов (без учёта регистра).
Input:
List<String> lines = List.of(
    "Stream API is powerful",
    "Java stream is powerful",
    "Powerful tools in Java"
);*/