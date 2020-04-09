package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Driving bus");
    }

    @Override
    public void passengers(int number) {
        System.out.println(number + "  passengers in the bus");
    }

    @Override
    public int fillTank(int amount) {
        return amount * 45;
    }
}
