package ru.job4j.array;

/**
 * Класс для записи данных в массив с помощью цикла
 * @author Shakhzod Kamilov
 */

public class ArrayLoop {
    /**
     * Main.
     * @param args-args
     */
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
