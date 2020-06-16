package ru.job4j.tracker;

/**
 * Поиск элемента по Id
 */
public class SearchIdAction implements UserAction {
    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Item search ===");
        String id = input.askStr("Enter item's Id: ");
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("Item wasn't found!");
        } else {
            System.out.println(item.getName());
        }
        return true;
    }
}
