package HomeWork13Files.Classes;

import java.io.*;
import java.util.ArrayList;

public class Student{

    public static void filterPassedStudents(int passingScore) {
        ArrayList<String> passed = new ArrayList<>();

        // Чтение файла students.txt
        try (BufferedReader reader = new BufferedReader(new FileReader("src/HomeWork13Files/Files/students.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split("\\s+", 2); // Разделение по пробелам (максимум 2 части)
                if (parts.length < 2) continue;

                String name = parts[0];
                try {
                    int score = Integer.parseInt(parts[1]);
                    if (score >= passingScore) {
                        passed.add(name + " " + score);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid mark: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading students " + e.getMessage());
            return;
        }

        // Запись в passed.txt
        try (PrintWriter writer = new PrintWriter(new FileWriter("src/HomeWork13Files/Files/passed.txt"))) {
            for (String student : passed) {
                writer.println(student);
            }
            System.out.println("Students with marks more than" + passingScore + " saved");
        } catch (IOException e) {
            System.err.println("Error writing students: " + e.getMessage());
        }
    }
}