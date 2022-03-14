package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Ехать");
    }

    @Override
    public void passengers(int people) {
        System.out.println("Пассажиры");

    }

    @Override
    public int refuel(int gas) {
        int price = 1;
        return gas * price;
    }
}
