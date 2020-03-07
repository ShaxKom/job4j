package ru.job4j.array;

/**
 * Дефрагментация массива
 * @author Shakhzod Kamilov
 * @version 1
 */
public class Defragment {
    /**
     * Перемещает заполненные ячейки в начало, пустые в конец
     * @param array входной массив
     * @return возвращает отсортированный массив
     */
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int point = i;
                while (array[point] == null && point != array.length - 1) {
                    point++;
                }
                array[i] = array[point];
                array[point] = null;
            }
            System.out.print(array[i] + " ");
        }
        return array;
    }
    /**
     * Main
     * @param args-args
     */
    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int i = 0; i < compressed.length; i++) {
            System.out.print(compressed[i] + " ");
        }
    }
}
