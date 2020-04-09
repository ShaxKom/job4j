package ru.job4j.poly;

public interface Transport {
    void drive();

    void passengers(int number);

    int fillTank(int amount);
}
