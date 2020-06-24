package ru.job4j.tracker;

/**
 * Вывод на консоль содержимого трекера.
 */
public class ShowAction implements UserAction {
    private final Output out;

    public ShowAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        if (items.length != 0) {
            for (Item item : items) {
                out.println(item);
            }
        } else {
            out.println("Tracker is empty!");
        }
        return true;
    }
}
