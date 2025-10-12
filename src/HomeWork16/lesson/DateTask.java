package HomeWork16.lesson;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

public class DateTask {
    final static Set<LocalDate> HOLIDAYS = Set.of(
            LocalDate.of(LocalDate.now().getYear(), 1, 1), //Новый год
            LocalDate.of(LocalDate.now().getYear(), 1, 7), //Рождество
            LocalDate.of(LocalDate.now().getYear(), 5, 9) //День Победы
    );

    public static void getDays() {
        Scanner scanner = new Scanner(System.in);
        String inputDate = scanner.nextLine();
        LocalDate startVacation = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        int count = scanner.nextInt();
        int workDays = 0;
        LocalDate endVacation = startVacation.plusDays(count - 1);

        System.out.println("Начало отпуска:" + startVacation);
        System.out.println("Конец отпуска:" + endVacation);
        for (LocalDate date = startVacation; !date.isAfter(endVacation); date = date.plusDays(1)) {
            DayOfWeek day = date.getDayOfWeek();
            boolean isWeekend = day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
            LocalDate finalDate = date;
            Optional<LocalDate> holiday = HOLIDAYS.stream().filter(h -> h.getMonth().equals(finalDate.getMonth()) && h.getDayOfMonth() == finalDate.getDayOfMonth()).findFirst();

            if (holiday.isPresent()) {
                System.out.println(date);
            }

            if (!isWeekend && holiday.isEmpty()) {
                workDays++;
            }
        }

        System.out.println("Рабочих дней:" + workDays);
    }
}
