package HomeWork16.methodic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.print("Enter your birthday ");
        String input = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(input, formatter);
        LocalDate hundredYears = birthDate.plusYears(100);
        System.out.println("Date when you bee 100 years old " + hundredYears);
        System.out.println("---------------------------------- TASK 1");

        //2
        Set<Integer> numbers = Set.of(-5, -2, 0, 3, 7, 10, -1, 8);
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.print("Positive numbers: ");
        numbers.stream()
                .filter(isPositive)
                .forEach(x -> System.out.print(x + " "));
        System.out.println("\n---------------------------------- TASK 2");
        //3
        Function<String, Double> bynToUsd = s -> {
            String[] parts = s.split(" ");
            double amount = Double.parseDouble(parts[0]);
            return amount / 3;
        };
        String money = "30 BYN";
        double dollars = bynToUsd.apply(money);
        System.out.printf("%.2f BYN = %.2f USD%n",
                Double.parseDouble(money.split(" ")[0]), dollars);
        System.out.println("---------------------------------- TASK 3");
        //4
        Consumer<String> printUsd = s -> {
            String[] parts = s.split(" ");
            double amount = Double.parseDouble(parts[0]);
            double usd = amount / 3;
            System.out.printf("%s = %.2f USD%n", s, usd);
        };
        printUsd.accept("45 BYN");
        printUsd.accept("15 BYN");
        System.out.println("---------------------------------- TASK 4");
        //5
        System.out.print("Enter line: ");
        String original = scanner.nextLine();
        Supplier<String> reverseSupplier = () -> new StringBuilder(original).reverse().toString();

        String reversed = reverseSupplier.get();
        System.out.println("Reverse line: " + reversed);
        System.out.println("---------------------------------- END OF TASKS");
    }
}
/*Задача 1:
Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
когда пользователю исполнится 100 лет. Использовать Date/Time API.
Задача 2:
Используя Predicate среди массива чисел вывести только те, которые являются
положительными.
Задача 3:
Используя Function реализовать лямбду, которая будет принимать в себя строку в
формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
возвращать сумму, переведенную сразу в доллары.
Задача 4:
Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
выводить сумму, переведенную сразу в доллары.
Задача 5:
Используя Supplier написать метод, который будет возвращать введенную с консоли
строку задом наперед
* */