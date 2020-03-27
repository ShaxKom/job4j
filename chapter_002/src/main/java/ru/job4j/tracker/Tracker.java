package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Класс для хранения и обработки запросов на заявки.
 */
public class Tracker {
    /**
     * Массив для хранения заявок
     */
    private final Item[] items = new Item[100];
    /**
     * Указатель ячейки номера последней заявки
     */
    private int position = 0;

    /**
     * Добавление новой заявки в массив
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    /**
     * Генерирует уникальный ID для новой заявки
     * @return уникальный ID
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Находит все существующие заявки
     * @return заявки
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    /**
     * Находит заявки по имени
     * @param key имя заявки
     * @return заявки с совпадающими именами
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[position];
        int size = 0;
        for (int index = 0; index < position; index++) {
            if (items[index].getName() == key) {
                result[size] = items[index];
                size++;
            }
        }
        result = Arrays.copyOf(result, size);
        return result;
    }

    /**
     * Поиск заявок по ID
     * @param id номер заявки
     * @return заявка
     */
    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    /**
     * Поиск ячейки заявки по ID
     * @param id номер заявки
     * @return номер ячейки
     */
    private int indexOf(String id) {
        int index = -1;
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Замена заявки с сохранением старой ID
     * @param id номер заяки которую нужно заменить
     * @param item новая заявка
     */
    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        boolean truth = false;
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            truth = true;
        }
        return truth;
    }

    /**
     * Удаление заявки из хранилища
     * @param id
     */
    public boolean delete(String id) {
        boolean truth = false;
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, position - index);
            items[position - 1] = null;
            position--;
            truth = true;
        }
        return truth;
    }
}
