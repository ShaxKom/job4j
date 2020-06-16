package ru.job4j.tracker;

/**
 * Удаление элемента из трекера
 */
public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Removing item from tracker ===");
        String id = input.askStr("Enter item's Id: ");
        if (tracker.delete(id)) {
            System.out.println("Item successfully deleted!");
        } else {
            System.out.println("Item wasn't found!");
        }
        return true;
    }
}
