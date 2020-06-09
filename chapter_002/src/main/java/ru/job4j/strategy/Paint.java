package ru.job4j.strategy;

public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Paint shape = new Paint();
        shape.draw(new Triangle());
        shape.draw(new Square());
    }
}
