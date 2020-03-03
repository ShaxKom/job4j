package ru.job4j.array;

/**
 * Проверка элементов массива на однороднось
 * @author Shakhzod Kamilov
 * @version 1
 */
public class Check {
    /**
     * метод для проверки элементов массива на однородность
     * @param data массив элементов с логическим выражением
     * @return логическое выражение
     */
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean datum : data) {
            if (data[0] != datum) {
                result = false;
                break;
            }
        }
        return result;
    }
}
