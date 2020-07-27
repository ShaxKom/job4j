package ru.job4j.ex;

/**
 * Поиск элемента в массиве строк, с последующим возвратом номера ячейки или выбрасыванием исключения
 */
public class FindEl {
    /**
     * Поиск элемента посредством сравнения
     * @param value массив строк
     * @param key элемент для поиска
     * @return номер ячейки
     * @throws ElementNotFoundException
     */
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (key.equals(value[index])) {
                rsl = index;
            }
        }
        if (rsl == -1) {
            throw new  ElementNotFoundException("Couldn't find element "  + "\"" + key + "\"");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] el = {"a", "b", "c"};
        try {
            System.out.println(FindEl.indexOf(el, "x"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }

    }
}
