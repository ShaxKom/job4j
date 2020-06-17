package ru.job4j.tracker;

/**
 * Вывод на консоль содержимого трекера.
 */
public class ShowAction implements UserAction {
    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        if (items.length != 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Tracker is empty!");
        }
        return true;
    }
}