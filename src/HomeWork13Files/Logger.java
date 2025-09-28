package HomeWork13Files;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static final String LOG_FILE = "log.txt";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void log(String message) {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) { // true = append mode
            String timestamp = LocalDateTime.now().format(formatter);
            writer.write("[" + timestamp + "] " + message + "\n");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в лог: " + e.getMessage());

        }
    }
}