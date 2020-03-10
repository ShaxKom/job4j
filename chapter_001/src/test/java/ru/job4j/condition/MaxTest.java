package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MaxTest {
    @Test
    public void whenMax1to2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1to2Then1() {
        int result = Max.max(51, 23, 85);
        assertThat(result, is(85));
    }

    @Test
    public void whenMax1to2Equal() {
        int result = Max.max(14, 14);
        assertThat(result, is(14));
    }

    @Test
    public void whenMax1of4() {
        int result = Max.max(51, 35, 84, 97);
        assertThat(result, is(97));
    }

}
