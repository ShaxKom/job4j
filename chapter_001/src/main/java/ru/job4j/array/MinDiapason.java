package ru.job4j.array;

/**
 * Поиск минимального элемента массива
 * @author Shakhzod Kamilov
 * @version 1
 */
public class MinDiapason {
    /**
     * Находит минимальный элемент массива в заданном диапазоне
     * @param array вводный массив
     * @param start начало диапазона
     * @param finish конец диапазона
     * @return возвращает минимальный элемент
     */
    public static int findMin(int[] array, int start, int finish){
        int min = array[start];
        for (int index=start;index<=finish;index++){
            if(min>array[index]) min=array[index];
        }
        return min;
    }
}
