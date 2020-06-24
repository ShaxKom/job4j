package ru.job4j.tracker;

/**
 * Создание и добавление элемента в трекер.
 */
public class CreateAction implements UserAction {
    private final Output out;

    public CreateAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Add new items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Create a new item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        out.println("New item successfully added!");
        return true;
    }
}
