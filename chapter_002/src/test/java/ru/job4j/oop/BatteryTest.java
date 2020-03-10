package ru.job4j.oop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class BatteryTest {
    @Test
    public void whenFirstMoreSecond() {
        Battery first = new Battery(70);
        Battery second = new Battery(30);
        first.exchange(second);
        assertThat(first.getLoad(), is(0));
        assertThat(second.getLoad(), is(100));
    }

    @Test
    public void whenFirstLessSecond() {
        Battery first = new Battery(60);
        Battery second = new Battery(30);
        first.exchange(second);
        assertThat(first.getLoad(), is(0));
        assertThat(second.getLoad(), is(90));
    }

    @Test
    public void whenFirstEqualSecond() {
        Battery first = new Battery(40);
        Battery second = new Battery(40);
        first.exchange(second);
        assertThat(first.getLoad(), is(0));
        assertThat(second.getLoad(), is(80));
    }

}
