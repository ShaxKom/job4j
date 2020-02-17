package ru.job4j.array;

/**
 * Класс для сортировки содержимого массива.
 * @author Shakhzod Kamilov
 * @version 1
 */
public class AlgoArray {
    /**
     * Main.
     * @param args args.
     */
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4,8,10,18};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
