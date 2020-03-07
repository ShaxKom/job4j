package ru.job4j.array;

/**
 * Класс для поиска элемента в массиве
 * @author Shakhzod Kamilov
 * @version 3
 */
public class FindLoop {
    /**
     *
     * @param data  массив, в котором надо искать нужный элемент
     * @param el   элемент который нужно найты в массиве
     * @return   номер ячейки элемента в массиве
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (el == data[i]) {
                rst = i;
                break;
            }
        }
        return rst;
    }
    /**
     * Поиск элемента в массиве в заданном диапазоне
     * @param data вводный массив
     * @param el искомые элемент
     * @param start начальный индекс
     * @param finish конечный индекс
     * @return возвращает индекс элемента. В случае отсутствия -1
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int result = -1;
        for (int index = start; index <= finish; index++) {
            if (el == data[index]) {
                result = index;
                break;
            }
        }
        return result;
    }
    /**
     * Сортировка заданного массива от наименьшего к наибольшему
     * @param data входной массив
     * @return отсортированный массив
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            SwitchArray.swap(data, index, i);
        }
        return data;
    }
}
