package ru.job4j.array;

/**
 * Класс для перестановки элементов массива
 * @author Shakhzod Kamilov
 * @version 2
 */
public class SwitchArray {
    /**
     * Метод для перестановки произволных элементов заданного массива
     * @param array Входной массив
     * @param source первый элемент перестановки
     * @param dest второй элемент для перестановки
     * @return результат перестановки, возвращает массив
     */
    public static int[] swap(int[] array,int source, int dest ){
        int temp = array[source];
        array[source]=array[dest];
        array[dest]=temp;
        return array;
    }

    /**
     * Метод для перестановки первого и последнего элемента массива
     * @param array Входной массив
     * @return результат перестановки, возвращает массив
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = temp;
        return array;
    }

    /**
     * Main
     * @param args - args
     */
    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int i : rsl) {
            System.out.println(i);
        }
    }
}
