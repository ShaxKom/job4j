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
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Item");
        tracker.add(item);
        String[] answer = {item.getId(), "Replaced"};
        StartUI.replaceItem(new StubInput(answer), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("Replaced"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Item");
        tracker.add(item);
        String[] answer = {item.getId()};
        StartUI.deleteItem(new StubInput(answer), tracker);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }
}
