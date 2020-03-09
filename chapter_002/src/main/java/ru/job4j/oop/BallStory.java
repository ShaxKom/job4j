package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Wolf seriy = new Wolf();
        Hare zayats = new Hare();
        Fox lisa = new Fox();

        seriy.tryEat(kolobok);
        zayats.tryEat(kolobok);
        lisa.tryEat(kolobok);
    }
}
