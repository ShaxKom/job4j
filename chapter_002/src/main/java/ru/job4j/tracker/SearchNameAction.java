package ru.job4j.tracker;

/**
 * Поиск элемента по имени
 */
public class SearchNameAction implements UserAction {
    private final Output out;

    public SearchNameAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Item search ===");
        String name = input.askStr("Enter item's name: ");
        Item[] items = tracker.findByName(name);
        if (items.length != 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Item wasn't found!");
        }
        return true;
    }
}
