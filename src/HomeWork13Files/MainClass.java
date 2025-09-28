package HomeWork13Files;

public class MainClass {
    public static void main(String[] args) {
        // --- Логирование ---
        Logger.log("Программа запущена");

        // --- Фильтрация студентов ---
        Student.filterPassedStudents(6);

        // --- Игра ---
        Game game = new Game("Alex", 7, 25000);
        game.saveGame();

        // Загружаем обратно
        Game loaded = Game.loadGame();
        if (loaded != null) {
            System.out.println("Загруженная игра: " + loaded);
        }

        Logger.log("Программа завершена");
    }
}
