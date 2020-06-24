package ru.job4j.tracker;

/**
 * Консольное приложение для класса Tracker.
 * @author Shakhzod Kamilov
 */
public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }
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
        out.println("Menu.");
        for (int index = 0; index < action.length; index++) {
          out.println(index + ". " + action[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Output output = new ConsoleOutput();
        Tracker tracker = new Tracker();
        UserAction[] action = {new CreateAction(output), new ShowAction(output), new ReplaceAction(output),
                               new DeleteAction(output), new SearchIdAction(output), new SearchNameAction(output),
                               new ExitAction()};
        new StartUI(output).init(input, tracker, action);
    }
}
