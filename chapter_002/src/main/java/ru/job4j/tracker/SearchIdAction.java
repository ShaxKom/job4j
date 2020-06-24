package ru.job4j.tracker;

/**
 * Поиск элемента по Id
 */
public class SearchIdAction implements UserAction {
    private final Output out;

    public SearchIdAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Item search ===");
        String id = input.askStr("Enter item's Id: ");
        Item item = tracker.findById(id);
        if (item == null) {
            out.println("Item wasn't found!");
        } else {
            out.println(item.getName());
        }
        return true;
    }
}
