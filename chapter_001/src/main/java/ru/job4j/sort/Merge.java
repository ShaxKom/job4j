package ru.job4j.sort;

/**
 * Объединение двух массивов
 * @author Shakhzod Kamilov
 * @version 1
 */
public class Merge {
    /**
     * Объединяет два массива и выдаёт готовый отсортированный
     * @param left первый массив
     * @param right второй массив
     * @return объеденённый массив
     */
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int first = 0;
        int second = 0;
        int third = 0;
       while (first < left.length && second < right.length) {
           if (left[first] < right[second]) {
               result[third] = left[first];
               first++;
           } else {
               result[third] = right[second];
               second++;
           }
           third++;
       }
       if (first < second) {
           for ( ; third < result.length; third++) {
               result[third] = left[first];
               first++;
           }
       } else {
           for ( ; third < result.length; third++) {
               result[third] = right[second];
               second++;
           }
       }
        return result;
    }
}
