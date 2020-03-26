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
        int size = 0;
        Item[] itemWithoutNull = new Item[position];
        for (int index = 0; index < position; index++) {
            if (items[index] != null) {
                itemWithoutNull[size] = items[index];
                size++;
            }
        }
        itemWithoutNull = Arrays.copyOf(itemWithoutNull, size);
        return itemWithoutNull;
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
        Item result = null;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                result = items[index];
                break;
            }
        }
        return result;
    }
}
