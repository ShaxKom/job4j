package ru.job4j.tracker;

/**
 * Замена элеменат в трекере по Id.
 */
public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Replacing Item ===");
        String id = input.askStr("Enter item's Id: ");
        String name = input.askStr("Enter new item: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("Item successfully replaced!");
        } else {
            out.println("Item wasn't found!");
        }
        return true;
    }
}
