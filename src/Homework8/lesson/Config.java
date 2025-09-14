package Homework8.lesson;

//Создай класс Config с static final полями APP_NAME, VERSION, MAX_USERS.
// Заполните эти значения в статическом блоке через VM options.
// Используй эти значения в методе main() другого класса — имитируй доступ к конфигу приложения.
// Config.java

//создала новую конфигурацию и добавила поле VM options. Туда вставила строку -Dapp.name=MyAppName -Dapp.version=3.1 -Dapp.max.users=1000
// таким образом я задала свои параметры. если же их не будет то будут использованы значения по умолчанию, укзананные ниже
public class Config {
    //создание переменных
    public static final String APP_NAME;
    public static final String VERSION;
    public static final int MAX_USERS;

    // Статический блок для инициализации из VM options
    static {
        //получение значений из блока, в противном случае - значения по умолчанию
        APP_NAME = System.getProperty("app.name", "UnknownApp");
        VERSION = System.getProperty("app.version", "1.0");

        //проверка: корректно ли указано значение в конфигурации. В противном случае установить значение по умолчанию 100
        String maxUsersStr = System.getProperty("app.max.users");
        int maxUsers;
        try {
            maxUsers = maxUsersStr != null ? Integer.parseInt(maxUsersStr) : 100;
        } catch (NumberFormatException e) {
            System.out.println("Incorrect value app.max.users, use default value: 100");
            maxUsers = 100;
        }
        MAX_USERS = maxUsers;

        System.out.println("Configuration loaded");
    }
}
