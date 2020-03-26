package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void testFindAll() {
        Tracker tracker = new Tracker();
        Item first = new Item("item1");
        Item second = new Item("item2");
        Item third = new Item("item3");
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        assertThat(tracker.findAll(), is(new Item[]{first, second, third}));
    }

    @Test
    public void testFindByName() {
        Tracker tracker = new Tracker();
        Item first = new Item("Java");
        Item second = new Item("Python");
        Item third = new Item("Java");
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        assertThat(tracker.findByName("Java"), is(new Item[]{first, third}));
    }

    @Test
    public void testFindByIdNotNull() {
        Tracker tracker = new Tracker();
        Item item = new Item("Java");
        tracker.add(item);
        assertThat(tracker.findById(item.getId()), is(item));
    }

    @Test
    public void testFindByIdNull() {
        Tracker tracker = new Tracker();
        Item item = new Item("Java");
        Item result = tracker.findById(item.getId());
        assertThat(result, is(nullValue()));
    }


}
