package ru.job4j.loop;

/**
 * Класс для рисования креста на консонли
 * @author Shakhzod Kamilov
 * @since 15.02.2020
 * @version 1
 */

public class Slash {
    /**
     *  Метод для рисования креста и вывода на консоль.
     * @param size - размер креста.
     */
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
        for (int cell = 0; cell < size; cell++) {
            boolean left = cell == row;
            boolean right = cell + 1 == size - row;
            if (left) {
                System.out.print("0");
            } else if (right) {
                System.out.print("0");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
        System.out.println();
}

    /**
     * Main.
     * @param args - args
     */
    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 7");
        draw(7);
    }
}
