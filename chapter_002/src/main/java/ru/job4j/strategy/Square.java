package ru.job4j.strategy;

import java.util.StringJoiner;

public class Square implements Shape {
    @Override
    public String draw() {
        StringJoiner square = new StringJoiner(System.lineSeparator());
        square.add("* * * * *");
        square.add("*       *");
        square.add("*       *");
        square.add("* * * * *");
        return square.toString();
    }
}
