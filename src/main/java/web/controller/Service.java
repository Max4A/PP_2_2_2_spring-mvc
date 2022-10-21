package web.controller;

import web.model.Car;

import java.util.Arrays;
import java.util.List;

// Сервис класс для создания списка с нужным количеством авто
public class Service {

    private static Car[] carArr = {
            new Car("Ford", "Mustang", 1974),
            new Car("Dodge", "Charger", 1988),
            new Car("Toyota", "Supra", 1990),
            new Car("Nissan", "Skyline", 1992),
            new Car("Mazda", "RX8", 2003)
    };

    public static List<Car> getCars(int amount) {   // Возвращаем список при запросе с параметрами:
        if (amount > 0 && amount < 5) {
            return Arrays.asList(carArr).subList(0, amount);     // либо из 1-4 авто
        } else { return Arrays.asList(carArr); }                 // либо полный список 5 авто, если запрошено меньше 1 и больше 5
    }
}
