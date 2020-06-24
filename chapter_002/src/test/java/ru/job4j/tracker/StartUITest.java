package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Output output = new StubOutput();
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        UserAction action = new CreateAction(output);
        action.execute(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("Item");
        tracker.add(item);
        UserAction action = new ReplaceAction(out);
        String[] answer = {item.getId(), "Replaced"};
        Input input = new StubInput(answer);
        action.execute(input, tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("Replaced"));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("Item");
        tracker.add(item);
        String[] answer = {item.getId()};
        UserAction action = new DeleteAction(out);
        Input input = new StubInput(answer);
        action.execute(input, tracker);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenCreateAction() {
        Input input = new StubInput(new String[] {"0", "Item creation", "1"});
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        UserAction[] action = {new CreateAction(out), new ExitAction()};
        new StartUI(out).init(input, tracker, action);
        assertThat(tracker.findAll()[0].getName(), is("Item creation"));
    }

    @Test
    public void whenReplaceAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("New Item"));
        UserAction[] action = {new ReplaceAction(out), new ExitAction()};
        Input input = new StubInput(new String[] {"0", item.getId(), "Replaced Item", "1"});
        new StartUI(out).init(input, tracker, action);
        assertThat(tracker.findAll()[0].getName(), is("Replaced Item"));
    }

    @Test
    public void whenDeleteAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("new Item"));
        UserAction[] action = {new DeleteAction(out), new ExitAction()};
        Input input = new StubInput(new String[] {"0", item.getId(), "1"});
        new StartUI(out).init(input, tracker, action);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input input = new StubInput(new String[]{"0"});
        Tracker tracker = new Tracker();
        UserAction[] action = {new ExitAction()};
        new StartUI(out).init(input, tracker, action);
        assertThat(out.toString(), is("Menu." + System.lineSeparator()
                                        + "0. Exit program" + System.lineSeparator()));
    }

    @Test
    public void whenFindAllAction() {
        Output out = new StubOutput();
        Input input = new StubInput(new String[]{"0", "1"});
        Tracker tracker = new Tracker();
        UserAction[] action = {new ShowAction(out), new ExitAction()};
        new StartUI(out).init(input, tracker, action);
        assertThat(out.toString(), is("Menu." + System.lineSeparator()
                                        + "0. Show all items" + System.lineSeparator()
                                        + "1. Exit program" + System.lineSeparator()
                                        + "Tracker is empty!" + System.lineSeparator()
                                        + "Menu." + System.lineSeparator()
                                        + "0. Show all items" + System.lineSeparator()
                                        + "1. Exit program" + System.lineSeparator()));
    }

    @Test
    public void whenFindByNameAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[] {"0", "Fake name", "1"});
        UserAction[] action = {new SearchNameAction(out), new ExitAction()};
        new StartUI(out).init(input, tracker, action);
        assertThat(out.toString(), is("Menu." + System.lineSeparator()
                + "0. Find items by name" + System.lineSeparator()
                + "1. Exit program" + System.lineSeparator()
                + "=== Item search ===" + System.lineSeparator()
                + "Item wasn't found!" + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. Find items by name" + System.lineSeparator()
                + "1. Exit program" + System.lineSeparator()));
    }

    @Test
    public void whenFindByIdAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        UserAction[] action = {new SearchIdAction(out), new ExitAction()};
        Input input = new StubInput(new String[] {"0", "Fake Id", "1"});
        new StartUI(out).init(input, tracker, action);
        assertThat(out.toString(), is("Menu." + System.lineSeparator()
                + "0. Find item by Id" + System.lineSeparator()
                + "1. Exit program" + System.lineSeparator()
                + "=== Item search ===" + System.lineSeparator()
                + "Item wasn't found!" + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. Find item by Id" + System.lineSeparator()
                + "1. Exit program" + System.lineSeparator()));
    }
}
