package ru.job4j.condition;

/**
 * Нахождение большего числа среди данных
 */
public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int forth) {
        return max(first, max(second, third, forth));
    }
}
