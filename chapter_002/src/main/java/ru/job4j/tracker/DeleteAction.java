package ru.job4j.tracker;

/**
 * Удаление элемента из трекера
 */
public class DeleteAction implements UserAction {
    private final Output out;
    public DeleteAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Removing item from tracker ===");
        String id = input.askStr("Enter item's Id: ");
        if (tracker.delete(id)) {
            out.println("Item successfully deleted!");
        } else {
            out.println("Item wasn't found!");
        }
        return true;
    }
}
