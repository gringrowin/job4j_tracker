package ru.job4j.oop;

public class Transport {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Plane plane1 = new Plane();
        Plane plane2 = new Plane();
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        Vehicle[] vehicles = new Vehicle[] {car1, car2, plane1, plane2, bus1, bus2};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
