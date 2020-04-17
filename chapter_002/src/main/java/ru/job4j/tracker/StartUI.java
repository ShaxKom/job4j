package ru.job4j.tracker;

/**
 * Консольное приложение для класса Tracker.
 * @author Shakhzod Kamilov
 */
public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("New item successfully added!");
    }

    public static void showAllItems(Tracker tracker) {
        Item[] items = tracker.findAll();
        if (items.length != 0) {
            for (Item item : items) {
                System.out.println("Item's name: " + item.getName() + "  Id: " + item.getId());
            }
        } else {
            System.out.println("Tracker is empty!");
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Replacing Item ===");
        String id = input.askStr("Enter item's Id: ");
        String name = input.askStr("Enter new item: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item successfully replaced!");
        } else {
            System.out.println("Item wasn't found!");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Removing item from tracker ===");
        String id = input.askStr("Enter item's Id: ");
        if (tracker.delete(id)) {
            System.out.println("Item successfully deleted!");
        } else {
            System.out.println("Item wasn't found!");
        }
    }

    public static void searchById(Input input, Tracker tracker) {
        System.out.println("=== Item search ===");
        String id = input.askStr("Enter item's Id: ");
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("Item wasn't found!");
        } else {
            System.out.println(item.getName());
        }
    }

    public static void searchByName(Input input, Tracker tracker) {
        System.out.println("=== Item search ===");
        String name = input.askStr("Enter item's name: ");
        Item[] items = tracker.findByName(name);
        if (items.length != 0) {
            for (Item item : items) {
                System.out.println("Item's name: " + item.getName() + "  Id: " + item.getId());
            }
        } else {
            System.out.println("Item wasn't found!");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 6) {
                run = false;
            } else if (select == 1) {
                StartUI.showAllItems(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.searchById(input, tracker);
            } else if (select == 5) {
             StartUI.searchByName(input, tracker);
            }
        }
    }

    /**
     * Меню для пользовотельского интерфейса
     */
    private void showMenu() {
        final String LN = System.lineSeparator();
        System.out.println("Menu" + LN
        + "0.Add new items" + LN
        + "1.Show all items" + LN
        + "2.Edit item" + LN
        + "3.Delete item" + LN
        + "4.Find item by Id" + LN
        + "5.Find items by name" + LN
        + "6.Exit program");

    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
