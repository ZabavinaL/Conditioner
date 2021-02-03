package ru.netology.constructor;

public class Conditioner {
    private int id;
    private String name = "noname"; // инициализаторы полей
    private int maxTemperature = 30; // инициализаторы полей
    private int minTemperature = 15; // инициализаторы полей
    private int currentTemperature = 22; // инициализаторы полей
    private boolean on;


// НИЖЕ КОНСТРУКТОР, У КОТОРОГО ТАКОЕ ЖЕ ИМЯ, КАК У КЛАССА. НА ВХОД ОЖИДАЕТ ВСЕ ПАРАМЕТРЫ.
    // КОГДА МЫ БУДЕМ ЕГО ВЫЗЫВАТЬ, НАПРИМЕР В ТЕСТЕ (new Conditioner()), то будем задавать все параметры.
    //Инициализируем поля во время вызова этого конструктора
    public Conditioner(int id,
                       String name,
                       int maxTemperature,
                       int minTemperature,
                       int currentTemperature,
                       boolean on) {
        this.id = id;
        this.name = name;
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
        this.currentTemperature = currentTemperature;
        this.on = on; //принимается параметр, который пришел из сигнатуры (выше)
    }




    public Conditioner() { // если не используем, удаляем
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
