package ru.job4j.loop;

/**
 *  Класс для определения простых чисел.
 * @author Shakhzod Kamilov
 * @version 1
 */
public class CheckPrimeNumber {

    /**
     * Метод проверяет является ли число простым.
     * @param number - принимает целое числою
     * @return возвращает логическое выражение, простое число или нет.
     */

    public static boolean check(int number) {
        boolean prime = number > 1 ? true : false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
            }
        return prime;
        }
    }

