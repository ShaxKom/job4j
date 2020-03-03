package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
public class SqMaxTest {
    @Test
    public void firstMax() {
        int expect = 8;
        int result = SqMax.max(8, 4, 5, 2);
        assertThat(expect, is(result));
    }

    @Test
    public void secondMax() {
        int expect = 9;
        int result = SqMax.max(3, 9, 7, 1);
        assertThat(expect, is(result));
    }

    @Test
    public void thirdMax() {
        int expect = 7;
        int result = SqMax.max(6, 4, 7, 5);
        assertThat(result, is(expect));
    }

    @Test
    public void forthMax() {
        int expect = 15;
        int result = SqMax.max(14, 8, 5, 15);
        assertThat(expect, is(result));
    }
}
