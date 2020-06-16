package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        UserAction action = new CreateAction();
        action.execute(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Item");
        tracker.add(item);
        UserAction action = new ReplaceAction();
        String[] answer = {item.getId(), "Replaced"};
        Input input = new StubInput(answer);
        action.execute(input, tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("Replaced"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Item");
        tracker.add(item);
        String[] answer = {item.getId()};
        UserAction action = new DeleteAction();
        Input input = new StubInput(answer);
        action.execute(input, tracker);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenCreateAction() {
        Input input = new StubInput(new String[] {"0", "Item creation", "1"});
        Tracker tracker = new Tracker();
        UserAction[] action = {new CreateAction(), new ExitAction()};
        new StartUI().init(input, tracker, action);
        assertThat(tracker.findAll()[0].getName(), is("Item creation"));
    }

    @Test
    public void whenReplaceAction() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("New Item"));
        UserAction[] action = {new ReplaceAction(), new ExitAction()};
        Input input = new StubInput(new String[] {"0", tracker.findAll()[0].getId(), "Replaced Item", "1"});
        new StartUI().init(input, tracker, action);
        assertThat(tracker.findAll()[0].getName(), is("Replaced Item"));
    }

    @Test
    public void whenDeleteAction() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("new Item"));
        UserAction[] action = {new DeleteAction(), new ExitAction()};
        Input input = new StubInput(new String[] {"0", tracker.findAll()[0].getId(), "1"});
        new StartUI().init(input, tracker, action);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }
}
