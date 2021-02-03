package ru.netology.lombok;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor // конструктор без аргументов
@AllArgsConstructor // конструктор со всеми аргументами
@Data // генеритует геттеры и сеттеры
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


    public Conditioner(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }
}
