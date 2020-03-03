package ru.job4j.array;

/**
 * Класс для определения на совпадение последних символов массива
 * @author Shakhzod Kamilov
 * @version 1
 */
public class EndsWith {
    /**
     * Определяет совпадают ли последние символы двух массивов
     * @param word - слово целиком
     * @param post - постфикс
     * @return возвращает логическое вырежение.
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        if (word.length >= post.length) {
            result = true;
            for (int index = 1; index <= post.length; index++) {
                if (word[word.length - index] != post[post.length - index]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
