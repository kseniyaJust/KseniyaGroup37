package HomeWork8.lesson;


public class MainClass {
    public static void main(String[] args) {
        //Config
        System.out.println("=== Configuration options ===");
        System.out.println("Project name: " + Config.APP_NAME);
        System.out.println("Version: " + Config.VERSION);
        System.out.println("Max count of users: " + Config.MAX_USERS);

        // Пример логики на основе конфига
        if (Config.MAX_USERS > 50) {
            System.out.println("Mode: High load");
        } else {
            System.out.println("Mode: Low load");
        }
        System.out.println("--------------------- END OF CONFIG");


    }
}
