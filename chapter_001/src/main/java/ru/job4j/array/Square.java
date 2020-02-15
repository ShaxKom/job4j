package ru.job4j.array;

/**
 * Возведение данного количества чисел в квадрат
 * @author Shakhzod Kamilov
 * @version 1
 */
public class Square {
    /**
     * Возведение чисел в квадрат с последующей записью в массив
     * @param bound до какого числа возводить в квадрат
     * @return массив возведенных в квадрат чисел
     */
    public static int[] calculate(int bound){
        int[] rst = new int[bound];
        for (int i=0; i<bound;i++)
            rst[i]=i*i;
        return rst;
    }

    /**
     * Main.
     * @param args-args
     */
    public static void main(String[] args){
        int[] array=calculate(4);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
