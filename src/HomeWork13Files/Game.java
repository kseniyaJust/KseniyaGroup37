package HomeWork13Files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Game {
    private String userName;
    private int lvl;
    private int score;

    public Game(String userName, int lvl, int score) {
        this.userName = userName;
        this.lvl = lvl;
        this.score = score;
    }

    // Геттеры и сеттеры
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
    public int getLvl() { return lvl; }
    public void setLvl(int lvl) { this.lvl = lvl; }
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    // Сохранить игру
    public void saveGame() {
        Properties props = new Properties();
        props.setProperty("userName", userName);
        props.setProperty("lvl", String.valueOf(lvl));
        props.setProperty("score", String.valueOf(score));

        try (FileWriter writer = new FileWriter("game.save")) {
            props.store(writer, "Saved game state");
            System.out.println("Игра сохранена: " + userName);
            Logger.log("Game saved: " + userName);
        } catch (IOException e) {
            System.err.println("Ошибка при сохранении игры: " + e.getMessage());
            Logger.log("Save failed: " + e.getMessage());
        }
    }

    // Загрузить игру
    public static Game loadGame() {
        File file = new File("game.save");
        if (!file.exists()) {
            System.out.println("Файл сохранения не найден.");
            return null;
        }

        Properties props = new Properties();
        try (FileReader reader = new FileReader(file)) {
            props.load(reader);

            String userName = props.getProperty("userName", "Unknown");
            int lvl = Integer.parseInt(props.getProperty("lvl", "1"));
            int score = Integer.parseInt(props.getProperty("score", "0"));

            Game game = new Game(userName, lvl, score);
            System.out.println("Игра загружена: " + userName);
            Logger.log("Game loaded: " + userName);
            return game;

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла сохранения: " + e.getMessage());
            Logger.log("Load failed: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Некорректные данные в файле сохранения.");
            Logger.log("Invalid data in save file.");
        }
        return null;
    }

    @Override
    public String toString() {
        return "Game{" +
                "userName='" + userName + '\'' +
                ", lvl=" + lvl +
                ", score=" + score +
                '}';
    }
}
