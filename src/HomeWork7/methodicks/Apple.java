package HomeWork7.methodicks;


public class Apple {
    //Задача *:
    //Создать класс Apple и добавить в него поле color с модификатором доступа private и
    //инициализировать его. В методе main другого класса создать объект Apple, и не
    //используя сеттеры изменить значение поля color.
    private String color = "red";

    public String getColor() {
        return color;
    }
}