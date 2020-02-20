package ru.job4j.array;

import  org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тест-класс для Check.java
 * @author Shakhzod Kamilov
 */
public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] input = new boolean[]{true, true, true};
        boolean rst = Check.mono(input);
        assertThat(rst, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] input = new boolean[]{true, false, true};
        boolean rst = Check.mono(input);
        assertThat(rst, is(false));
    }

    @Test
    public void whenDataMonoByFalseThenTrue() {
        boolean[] input = new boolean[]{false, false, false};
        boolean rst = Check.mono(input);
        assertThat(rst, is(true));
    }
}
