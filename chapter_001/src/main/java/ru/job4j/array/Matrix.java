package ru.job4j.array;
/**
 * Таблица умножения
 * @author Shakhzod Kamilov
 */
public class Matrix {
    /**
     * Возвращает таблицу умножения данного размера
     * @param size размер таблицы
     * @return возвращает матрицу
     */
   public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
