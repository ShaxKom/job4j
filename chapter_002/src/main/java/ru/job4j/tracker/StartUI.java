package ru.job4j.tracker;

/**
 * Консольное приложение для класса Tracker.
 * @author Shakhzod Kamilov
 */
public class StartUI {

    public void init(Input input, Tracker tracker, UserAction[] action) {
        boolean run = true;
        while (run) {
            this.showMenu(action);
            int select = input.askInt("Select: ");
            run = action[select].execute(input, tracker);
        }
    }

    /**
     * Меню для пользовотельского интерфейса
     */
    private void showMenu(UserAction[] action) {
        System.out.println("Menu.");
        for (int index = 0; index < action.length; index++) {
            System.out.println(index + ". " + action[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] action = {new CreateAction(), new ShowAction(), new ReplaceAction(),
                               new DeleteAction(), new SearchIdAction(), new SearchNameAction(), new ExitAction()};
        new StartUI().init(input, tracker, action);
    }
}
