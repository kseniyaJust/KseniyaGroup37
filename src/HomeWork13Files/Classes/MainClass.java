package HomeWork13Files.Classes;


public class MainClass {
    public static void main(String[] args) {
        // Loging
        Logger.log("Program start");

        // Students
        Student.filterPassedStudents(6);

        // Gaming
        Game game = new Game("Alex", 7, 25000);
        game.saveGame();

        // Загружаем обратно
        Game loaded = Game.loadGame();
        if (loaded != null) {
            System.out.println("Loaded game: " + loaded);
        }

        Logger.log("Program exit");
    }
}
