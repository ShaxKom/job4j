package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Консольное приложение для класса Tracker.
 * @author Shakhzod Kamilov
 */
public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new item ===");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("New item successfully added!");
            } else if (select == 6) {
                run = false;
            } else if (select == 1) {
                Item[] items = tracker.findAll();
                if (items.length != 0) {
                    for (Item item : items) {
                        System.out.println("Item's name: " + item.getName() + "  Id: " + item.getId());
                    }
                } else {
                    System.out.println("Tracker is empty!");
                }
            } else if (select == 2) {
                System.out.println("=== Replacing Item ===");
                System.out.println("Enter item's Id: ");
                String id = scanner.nextLine();
                System.out.println("Enter new item: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Item successfully replaced!");
                } else {
                    System.out.println("Item wasn't found!");
                }
            } else if (select == 3) {
                System.out.println("=== Removing item from tracker ===");
                System.out.println("Enter item's Id: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("Item successfully deleted!");
                } else {
                    System.out.println("Item wasn't found!");
                }
            } else if (select == 4) {
                System.out.println("=== Item search ===");
                System.out.println("Enter item's Id: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                if (item == null) {
                    System.out.println("Item wasn't found!");
                } else {
                    System.out.println(item.getName());
                }
            } else if (select == 5) {
                System.out.println("=== Item search ===");
                System.out.println("Enter item's name: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                if (items.length != 0) {
                    for (Item item : items) {
                        System.out.println("Item's name: " + item.getName() + "  Id: " + item.getId());
                    }
                } else {
                    System.out.println("Item wasn't found!");
                }
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
        + "6.Exit program" + LN
        + "Select: ");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
