package ru.job4j.array;

/**
 * Класс для поиска элемента в массива
 * @author Shakhzod Kamilov
 * @version 1
 */
public class FindLoop {
    /**
     *
     * @param data  массив, в котором надо искать нужный элемент
     * @param el   элемент который нужно найты в массиве
     * @return   номер ячейки элемента в массиве
     */
    public int indexOf(int[] data, int el){
        int rst = -1;
        for (int i=0; i<data.length;i++){
            if (el==data[i]) {
                rst = i;
                break;
            }
        }
        return rst;
    }

}
