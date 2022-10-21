package web;

import web.controller.Service;

// Тестовые проверки сервиса
public class Test {
    public static void main(String[] args) {
        System.out.println(Service.getCars(-1));
        System.out.println(Service.getCars(1));
        System.out.println(Service.getCars(4));
        System.out.println(Service.getCars(8));
    }
}
