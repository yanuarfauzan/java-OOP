package app.application;

import app.data.Car;
import app.data.Avanza;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        car.getTire();
        car.drive();
        car.getBrand();

        System.out.println(car.getTire());
    }
}
