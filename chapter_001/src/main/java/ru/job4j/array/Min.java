package ru.job4j.array;

/**
 * Класс для поиска минимального числа в массиве
 * @author Shakhzod Kamilov
 * @version 1
 */
public class Min {
    /**
     * Поиск минимального элемента массива
     * @param array входной массив
     * @return возвращает минимальный элемент в массиве
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
}
