package ru.job4j.tracker;

/**
 * Замена элеменат в трекере по Id.
 */
public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Replacing Item ===");
        String id = input.askStr("Enter item's Id: ");
        String name = input.askStr("Enter new item: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item successfully replaced!");
        } else {
            System.out.println("Item wasn't found!");
        }
        return true;
    }
}
